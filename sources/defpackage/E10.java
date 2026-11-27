package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface E10 {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    public static final class b {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public static Object a(@NotNull E10 e10, @NotNull I10 i10, @NotNull LM lm) {
            F10 f10;
            if (lm instanceof F10) {
                f10 = (F10) lm;
                int i = f10.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    f10.e = i - Integer.MIN_VALUE;
                } else {
                    f10 = new F10(lm);
                }
            } else {
                f10 = new F10(lm);
            }
            Object objC = f10.d;
            Object obj = MN.d;
            int i2 = f10.e;
            if (i2 == 0) {
                C1795Pt1.b(objC);
                f10.e = 1;
                objC = e10.c(i10, f10);
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objC);
            }
            return new O10.c((H32.a) objC);
        }

        public static void b(@NotNull E10 e10, @Nullable String str) {
            String simpleName = e10.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            StringsKt.N(simpleName, "DirectionCalculator");
        }
    }

    public interface c {
    }

    @NotNull
    String a();

    @Nullable
    Object b(@NotNull I10 i10, @NotNull LM lm);

    @Nullable
    Object c(@NotNull I10 i10, @NotNull JM<? super H32.a> jm);
}
