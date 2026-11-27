package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ve1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7233ve1 {

    @Nullable
    public final String a;

    @NotNull
    public final a b;

    @NotNull
    public final String c;
    public final boolean d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final Integer g;

    @Nullable
    public final Throwable h;
    public final long i;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ve1$a[], still in use, count: 1, list:
      (r0v1 ve1$a[]) from 0x002a: INVOKE (r0v1 ve1$a[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:43)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: ve1$a */
    public static final class a {
        SHORT_LINK("short_link"),
        CONFIG("config"),
        NONE(DevicePublicKeyStringDef.NONE);


        @NotNull
        public final String d;

        static {
            C1952Ru.i(aVarArr);
        }

        public a(String str) {
            super(str, i);
            this.d = str;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public C7233ve1(@Nullable String str, @NotNull a source, @NotNull String probeUrl, boolean z, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Throwable th, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(probeUrl, "probeUrl");
        this.a = str;
        this.b = source;
        this.c = probeUrl;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = num;
        this.h = th;
        this.i = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7233ve1)) {
            return false;
        }
        C7233ve1 c7233ve1 = (C7233ve1) obj;
        return Intrinsics.a(this.a, c7233ve1.a) && this.b == c7233ve1.b && Intrinsics.a(this.c, c7233ve1.c) && this.d == c7233ve1.d && Intrinsics.a(this.e, c7233ve1.e) && Intrinsics.a(this.f, c7233ve1.f) && Intrinsics.a(this.g, c7233ve1.g) && Intrinsics.a(this.h, c7233ve1.h) && this.i == c7233ve1.i;
    }

    public final int hashCode() {
        String str = this.a;
        int iA = C2983be.a(C1039Gc0.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), this.d, 31);
        String str2 = this.e;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Throwable th = this.h;
        return Long.hashCode(this.i) + ((iHashCode3 + (th != null ? th.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlatformHostReport(host=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", probeUrl=");
        sb.append(this.c);
        sb.append(", probeUrlFromConfig=");
        sb.append(this.d);
        sb.append(", probeFinalHost=");
        sb.append(this.e);
        sb.append(", failure=");
        sb.append(this.f);
        sb.append(", httpStatus=");
        sb.append(this.g);
        sb.append(", cause=");
        sb.append(this.h);
        sb.append(", latencyMs=");
        return C0681Bn.c(sb, this.i, ")");
    }
}
