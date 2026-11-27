package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6680t02 {

    @NotNull
    public final a a;
    public final boolean b;
    public final int c;
    public final int d;

    @Nullable
    public final Integer e;
    public final boolean f;
    public final int g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: t02$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("COMPLETED", 0);
            d = aVar;
            a aVar2 = new a("CURRENT", 1);
            e = aVar2;
            a aVar3 = new a("PENDING", 2);
            g = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            h = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    public C6680t02(@NotNull a stepState, boolean z, int i, int i2, @Nullable Integer num, boolean z2, int i3) {
        Intrinsics.checkNotNullParameter(stepState, "stepState");
        this.a = stepState;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = z2;
        this.g = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6680t02)) {
            return false;
        }
        C6680t02 c6680t02 = (C6680t02) obj;
        return this.a == c6680t02.a && this.b == c6680t02.b && this.c == c6680t02.c && this.d == c6680t02.d && Intrinsics.a(this.e, c6680t02.e) && this.f == c6680t02.f && this.g == c6680t02.g;
    }

    public final int hashCode() {
        int iA = EF0.a(this.d, EF0.a(this.c, C2983be.a(this.a.hashCode() * 31, this.b, 31), 31), 31);
        Integer num = this.e;
        return Integer.hashCode(this.g) + C2983be.a((iA + (num == null ? 0 : num.hashCode())) * 31, this.f, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TopStepState(stepState=");
        sb.append(this.a);
        sb.append(", isStepNumberVisible=");
        sb.append(this.b);
        sb.append(", stepNameTextRes=");
        sb.append(this.c);
        sb.append(", innerCircleDrawableRes=");
        sb.append(this.d);
        sb.append(", innerCircleTintColorRes=");
        sb.append(this.e);
        sb.append(", isMiddleCircleVisible=");
        sb.append(this.f);
        sb.append(", textColorRes=");
        return SK.b(sb, this.g, ")");
    }
}
