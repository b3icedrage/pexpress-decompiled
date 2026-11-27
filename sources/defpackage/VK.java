package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class VK {

    @NotNull
    public static final VK i = new VK(0);

    @NotNull
    public final EnumC4593j41 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;

    @NotNull
    public final Set<a> h;

    public static final class a {

        @NotNull
        public final Uri a;
        public final boolean b;

        public a(@NotNull Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }
    }

    public VK() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !VK.class.equals(obj.getClass())) {
            return false;
        }
        VK vk = (VK) obj;
        if (this.b == vk.b && this.c == vk.c && this.d == vk.d && this.e == vk.e && this.f == vk.f && this.g == vk.g && this.a == vk.a) {
            return Intrinsics.a(this.h, vk.h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public VK(@NotNull EnumC4593j41 requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, @NotNull Set<a> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.a = requiredNetworkType;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = contentUriTriggers;
    }

    public VK(int i2) {
        this(EnumC4593j41.d, false, false, false, false, -1L, -1L, C6702t60.d);
    }
}
