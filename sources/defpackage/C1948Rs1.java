package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Rs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1948Rs1 {

    @NotNull
    public static final Bitmap.Config[] b;
    public final G1 a;

    static {
        b = Build.VERSION.SDK_INT >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
    }

    public C1948Rs1() {
        int i = Build.VERSION.SDK_INT;
        this.a = (i < 26 || C1150Hn0.a) ? new C1177Hw0(false) : (i == 26 || i == 27) ? TP0.h : new C1177Hw0(true);
    }

    @NotNull
    public static I70 a(@NotNull C7716xw0 getDrawableCompat, @NotNull Throwable throwable) {
        Drawable drawableF;
        Intrinsics.checkNotNullParameter(getDrawableCompat, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof C3927g71) {
            getDrawableCompat.x.getClass();
            Intrinsics.checkNotNullParameter(getDrawableCompat, "$this$getDrawableCompat");
            drawableF = null;
        } else {
            getDrawableCompat.x.getClass();
            drawableF = C5207m.f(getDrawableCompat, getDrawableCompat.v);
        }
        return new I70(drawableF, getDrawableCompat, throwable);
    }

    public static boolean b(@NotNull C7716xw0 request, @NotNull Bitmap.Config requestedConfig) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestedConfig, "requestedConfig");
        if (!C3057c.k(requestedConfig)) {
            return true;
        }
        if (!request.o) {
            return false;
        }
        InterfaceC5739oX1 interfaceC5739oX1 = request.c;
        if (!(interfaceC5739oX1 instanceof InterfaceC7234ve2)) {
            return true;
        }
        ImageView imageViewE = ((InterfaceC7234ve2) interfaceC5739oX1).e();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return !imageViewE.isAttachedToWindow() || imageViewE.isHardwareAccelerated();
    }
}
