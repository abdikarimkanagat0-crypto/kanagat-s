import { useState, useRef, useEffect } from 'react';
import { Button } from '@/components/ui/button';
import { Camera as CameraIcon, X, RefreshCw } from 'lucide-react';
import { toast } from 'sonner';

interface CameraProps {
  onCapture: (imageData: string) => void;
  onClose: () => void;
}

const Camera = ({ onCapture, onClose }: CameraProps) => {
  const videoRef = useRef<HTMLVideoElement>(null);
  const canvasRef = useRef<HTMLCanvasElement>(null);
  const [stream, setStream] = useState<MediaStream | null>(null);
  const [facingMode, setFacingMode] = useState<'user' | 'environment'>('user');
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    startCamera();
    return () => {
      if (stream) {
        stream.getTracks().forEach(track => track.stop());
      }
    };
  }, [facingMode]);

  const startCamera = async () => {
    try {
      setIsLoading(true);
      if (stream) {
        stream.getTracks().forEach(track => track.stop());
      }

      const mediaStream = await navigator.mediaDevices.getUserMedia({
        video: { facingMode },
        audio: false,
      });

      if (videoRef.current) {
        videoRef.current.srcObject = mediaStream;
      }
      setStream(mediaStream);
      setIsLoading(false);
    } catch (error) {
      console.error('Error accessing camera:', error);
      toast.error('Could not access camera');
      setIsLoading(false);
    }
  };

  const capturePhoto = () => {
    if (videoRef.current && canvasRef.current) {
      const canvas = canvasRef.current;
      const video = videoRef.current;
      
      canvas.width = video.videoWidth;
      canvas.height = video.videoHeight;
      
      const ctx = canvas.getContext('2d');
      if (ctx) {
        ctx.drawImage(video, 0, 0);
        const imageData = canvas.toDataURL('image/jpeg', 0.8);
        onCapture(imageData);
        
        if (stream) {
          stream.getTracks().forEach(track => track.stop());
        }
      }
    }
  };

  const toggleCamera = () => {
    setFacingMode(prev => prev === 'user' ? 'environment' : 'user');
  };

  return (
    <div className="fixed inset-0 z-50 bg-background">
      <div className="relative h-full w-full">
        {isLoading && (
          <div className="absolute inset-0 flex items-center justify-center bg-background">
            <div className="text-center">
              <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-primary mx-auto mb-4" />
              <p className="text-muted-foreground">Starting camera...</p>
            </div>
          </div>
        )}
        
        <video
          ref={videoRef}
          autoPlay
          playsInline
          muted
          className="h-full w-full object-cover"
        />
        
        <canvas ref={canvasRef} className="hidden" />
        
        <div className="absolute top-0 left-0 right-0 p-4 flex justify-between items-center bg-gradient-to-b from-black/50 to-transparent">
          <Button
            variant="ghost"
            size="icon"
            onClick={onClose}
            className="text-foreground hover:bg-white/20"
          >
            <X className="h-6 w-6" />
          </Button>
          
          <Button
            variant="ghost"
            size="icon"
            onClick={toggleCamera}
            className="text-foreground hover:bg-white/20"
          >
            <RefreshCw className="h-6 w-6" />
          </Button>
        </div>
        
        <div className="absolute bottom-0 left-0 right-0 p-8 flex justify-center bg-gradient-to-t from-black/50 to-transparent">
          <Button
            size="icon"
            variant="snap"
            onClick={capturePhoto}
            disabled={isLoading}
            className="h-20 w-20 rounded-full"
          >
            <CameraIcon className="h-10 w-10" />
          </Button>
        </div>
      </div>
    </div>
  );
};

export default Camera;
