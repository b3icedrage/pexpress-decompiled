package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4078gq1 {

    @NotNull
    public final a a;

    @Nullable
    public final String b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gq1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final /* synthetic */ a[] n;

        static {
            a aVar = new a("VPN", 0);
            d = aVar;
            a aVar2 = new a("VPN_NO_INSTRUCTION", 1);
            e = aVar2;
            a aVar3 = new a("EMAIL", 2);
            g = aVar3;
            a aVar4 = new a("NOT_OUR_USER", 3);
            a aVar5 = new a("OTHER", 4);
            h = aVar5;
            a aVar6 = new a("VALIDATION_ERROR", 5);
            i = aVar6;
            a aVar7 = new a("OUR_SERVER_ERROR", 6);
            j = aVar7;
            a aVar8 = new a("EMAIL_ALREADY_REGISTERED", 7);
            k = aVar8;
            a aVar9 = new a("CONNECTION", 8);
            l = aVar9;
            a aVar10 = new a("INCORRECT_CREDENTIALS", 9);
            m = aVar10;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            n = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) n.clone();
        }
    }

    public C4078gq1(@NotNull a errorType, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.a = errorType;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4078gq1)) {
            return false;
        }
        C4078gq1 c4078gq1 = (C4078gq1) obj;
        return this.a == c4078gq1.a && Intrinsics.a(this.b, c4078gq1.b) && this.c == c4078gq1.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RegError(errorType=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", shouldBlock=");
        return C2983be.b(sb, this.c, ")");
    }

    public /* synthetic */ C4078gq1(a aVar, boolean z, int i) {
        this(aVar, (i & 2) != 0 ? null : "", (i & 4) != 0 ? false : z);
    }
}
