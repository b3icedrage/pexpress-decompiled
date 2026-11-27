package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class EV implements ImageDecoder$OnHeaderDecodedListener {
    public final C1228In0 a = C1228In0.a();
    public final int b;
    public final int c;
    public final EnumC6357rU d;
    public final AbstractC6270r30 e;
    public final boolean f;
    public final EnumC2410Xg1 g;

    public class a implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public EV(int i, int i2, @NonNull C4227ha1 c4227ha1) {
        this.b = i;
        this.c = i2;
        this.d = (EnumC6357rU) c4227ha1.c(C6900u30.f);
        this.e = (AbstractC6270r30) c4227ha1.c(AbstractC6270r30.f);
        Z91<Boolean> z91 = C6900u30.i;
        this.f = c4227ha1.c(z91) != null && ((Boolean) c4227ha1.c(z91)).booleanValue();
        this.g = (EnumC2410Xg1) c4227ha1.c(C6900u30.g);
    }

    public final void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        if (this.a.b(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == EnumC6357rU.e) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC2410Xg1 enumC2410Xg1 = this.g;
        if (enumC2410Xg1 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC2410Xg1 == EnumC2410Xg1.d && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
