package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class KV {

    @NotNull
    public static final KV i = new KV(0);

    @NotNull
    public final ExecutorC7200vV a;

    @NotNull
    public final U0 b;

    @NotNull
    public final EnumC2303Wf1 c;

    @NotNull
    public final Bitmap.Config d;
    public final boolean e;

    @NotNull
    public final EnumC5195lx f;

    @NotNull
    public final EnumC5195lx g;

    @NotNull
    public final EnumC5195lx h;

    public KV() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KV)) {
            return false;
        }
        KV kv = (KV) obj;
        return Intrinsics.a(this.a, kv.a) && Intrinsics.a(this.b, kv.b) && this.c == kv.c && this.d == kv.d && this.e == kv.e && this.f == kv.f && this.g == kv.g && this.h == kv.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + C2983be.a(C2983be.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, this.e, 31), false, 923521)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.a + ", transition=" + this.b + ", precision=" + this.c + ", bitmapConfig=" + this.d + ", allowHardware=" + this.e + ", allowRgb565=false, placeholder=null, error=null, fallback=null, memoryCachePolicy=" + this.f + ", diskCachePolicy=" + this.g + ", networkCachePolicy=" + this.h + ')';
    }

    public KV(int i2) {
        ExecutorC7200vV dispatcher = C6266r20.c;
        U0 transition = U0.k;
        EnumC2303Wf1 precision = EnumC2303Wf1.d;
        Bitmap.Config bitmapConfig = Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        EnumC5195lx networkCachePolicy = EnumC5195lx.g;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        this.a = dispatcher;
        this.b = transition;
        this.c = precision;
        this.d = bitmapConfig;
        this.e = true;
        this.f = networkCachePolicy;
        this.g = networkCachePolicy;
        this.h = networkCachePolicy;
    }
}
