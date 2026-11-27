package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4136h70 extends C6188qf1 {

    @NotNull
    public final VH1.b l;

    @NotNull
    public final KW1 m;

    /* JADX INFO: renamed from: h70$a */
    public static final class a extends ML0 implements Function0<MH1[]> {
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ C4136h70 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str, C4136h70 c4136h70) {
            super(0);
            this.d = i;
            this.e = str;
            this.g = c4136h70;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MH1[] invoke() {
            int i = this.d;
            MH1[] mh1Arr = new MH1[i];
            for (int i2 = 0; i2 < i; i2++) {
                mh1Arr[i2] = SH1.c(this.e + JwtParser.SEPARATOR_CHAR + this.g.e[i2], RS1.d.a, new MH1[0], RH1.e);
            }
            return mh1Arr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4136h70(@NotNull String name, int i) {
        super(name, null, i);
        Intrinsics.checkNotNullParameter(name, "name");
        this.l = VH1.b.a;
        this.m = XO0.b(new a(i, name, this));
    }

    @Override // defpackage.C6188qf1
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MH1)) {
            return false;
        }
        MH1 mh1 = (MH1) obj;
        if (mh1.h() != VH1.b.a) {
            return false;
        }
        return Intrinsics.a(this.a, mh1.a()) && Intrinsics.a(LL.b(this), LL.b(mh1));
    }

    @Override // defpackage.C6188qf1, defpackage.MH1
    @NotNull
    public final VH1 h() {
        return this.l;
    }

    @Override // defpackage.C6188qf1
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        PH1 ph1 = new PH1(this);
        int iHashCode2 = 1;
        while (ph1.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) ph1.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.C6188qf1, defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        return ((MH1[]) this.m.getValue())[i];
    }

    @Override // defpackage.C6188qf1
    @NotNull
    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return CollectionsKt.J(new QH1(this), ", ", C1039Gc0.e(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
