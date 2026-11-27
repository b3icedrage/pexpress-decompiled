package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ja1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4695ja1 {

    @NotNull
    public final Context a;

    @NotNull
    public final Bitmap.Config b;

    @Nullable
    public final ColorSpace c;

    @NotNull
    public final XC1 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    @NotNull
    public final C2813ao0 h;

    @NotNull
    public final C2053Tb1 i;

    @NotNull
    public final EnumC5195lx j;

    @NotNull
    public final EnumC5195lx k;

    @NotNull
    public final EnumC5195lx l;

    public C4695ja1(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull XC1 scale, boolean z, boolean z2, boolean z3, @NotNull C2813ao0 headers, @NotNull C2053Tb1 parameters, @NotNull EnumC5195lx memoryCachePolicy, @NotNull EnumC5195lx diskCachePolicy, @NotNull EnumC5195lx networkCachePolicy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(memoryCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(diskCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = scale;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = headers;
        this.i = parameters;
        this.j = memoryCachePolicy;
        this.k = diskCachePolicy;
        this.l = networkCachePolicy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4695ja1)) {
            return false;
        }
        C4695ja1 c4695ja1 = (C4695ja1) obj;
        return Intrinsics.a(this.a, c4695ja1.a) && this.b == c4695ja1.b && Intrinsics.a(this.c, c4695ja1.c) && this.d == c4695ja1.d && this.e == c4695ja1.e && this.f == c4695ja1.f && this.g == c4695ja1.g && Intrinsics.a(this.h, c4695ja1.h) && Intrinsics.a(this.i, c4695ja1.i) && this.j == c4695ja1.j && this.k == c4695ja1.k && this.l == c4695ja1.l;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.d.hashCode() + ((C2983be.a(C2983be.a(C2983be.a((this.d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31, this.e, 31), this.f, 31), this.g, 31) + Arrays.hashCode(this.h.d)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Options(context=" + this.a + ", config=" + this.b + ", colorSpace=" + this.c + ", scale=" + this.d + ", allowInexactSize=" + this.e + ", allowRgb565=" + this.f + ", premultipliedAlpha=" + this.g + ", headers=" + this.h + ", parameters=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ')';
    }
}
