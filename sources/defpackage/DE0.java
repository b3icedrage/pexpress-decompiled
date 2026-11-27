package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DE0 {

    @NotNull
    public static final C1758Ph0 a;

    @NotNull
    public static final C1758Ph0[] b;

    @NotNull
    public static final C5025l71 c;

    @NotNull
    public static final EE0 d;

    static {
        C1758Ph0 c1758Ph0 = new C1758Ph0("org.jspecify.nullness");
        C1758Ph0 c1758Ph1 = new C1758Ph0("org.jspecify.annotations");
        a = c1758Ph1;
        C1758Ph0 c1758Ph2 = new C1758Ph0("io.reactivex.rxjava3.annotations");
        C1758Ph0 c1758Ph3 = new C1758Ph0("org.checkerframework.checker.nullness.compatqual");
        String strB = c1758Ph2.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        b = new C1758Ph0[]{new C1758Ph0(strB.concat(".Nullable")), new C1758Ph0(strB.concat(".NonNull"))};
        C1758Ph0 c1758Ph4 = new C1758Ph0("org.jetbrains.annotations");
        EE0 ee0 = EE0.d;
        Pair pair = new Pair(c1758Ph4, ee0);
        Pair pair2 = new Pair(new C1758Ph0("androidx.annotation"), ee0);
        Pair pair3 = new Pair(new C1758Ph0("android.support.annotation"), ee0);
        Pair pair4 = new Pair(new C1758Ph0("android.annotation"), ee0);
        Pair pair5 = new Pair(new C1758Ph0("com.android.annotations"), ee0);
        Pair pair6 = new Pair(new C1758Ph0("org.eclipse.jdt.annotation"), ee0);
        Pair pair7 = new Pair(new C1758Ph0("org.checkerframework.checker.nullness.qual"), ee0);
        Pair pair8 = new Pair(c1758Ph3, ee0);
        Pair pair9 = new Pair(new C1758Ph0("javax.annotation"), ee0);
        Pair pair10 = new Pair(new C1758Ph0("edu.umd.cs.findbugs.annotations"), ee0);
        Pair pair11 = new Pair(new C1758Ph0("io.reactivex.annotations"), ee0);
        C1758Ph0 c1758Ph5 = new C1758Ph0("androidx.annotation.RecentlyNullable");
        EnumC2599Zr1 enumC2599Zr1 = EnumC2599Zr1.WARN;
        Pair pair12 = new Pair(c1758Ph5, new EE0(enumC2599Zr1, 4));
        Pair pair13 = new Pair(new C1758Ph0("androidx.annotation.RecentlyNonNull"), new EE0(enumC2599Zr1, 4));
        Pair pair14 = new Pair(new C1758Ph0("lombok"), ee0);
        C6751tL0 c6751tL0 = new C6751tL0(2, 1, 0);
        EnumC2599Zr1 enumC2599Zr2 = EnumC2599Zr1.STRICT;
        c = new C5025l71(PW0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(c1758Ph0, new EE0(enumC2599Zr1, c6751tL0, enumC2599Zr2)), new Pair(c1758Ph1, new EE0(enumC2599Zr1, new C6751tL0(2, 1, 0), enumC2599Zr2)), new Pair(c1758Ph2, new EE0(enumC2599Zr1, new C6751tL0(1, 8, 0), enumC2599Zr2))));
        d = new EE0(enumC2599Zr1, 4);
    }
}
