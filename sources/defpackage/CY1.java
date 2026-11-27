package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CY1 {

    @NotNull
    public static final GW1 a = new GW1("NO_THREAD_ELEMENTS");

    @NotNull
    public static final a b = a.d;

    @NotNull
    public static final b c = b.d;

    @NotNull
    public static final c d = c.d;

    public static final class a extends ML0 implements Function2<Object, CoroutineContext.Element, Object> {
        public static final a d = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            CoroutineContext.Element element2 = element;
            if (!(element2 instanceof BY1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
        }
    }

    public static final class b extends ML0 implements Function2<BY1<?>, CoroutineContext.Element, BY1<?>> {
        public static final b d = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final BY1<?> invoke(BY1<?> by1, CoroutineContext.Element element) {
            BY1<?> by2 = by1;
            CoroutineContext.Element element2 = element;
            if (by2 != null) {
                return by2;
            }
            if (element2 instanceof BY1) {
                return (BY1) element2;
            }
            return null;
        }
    }

    public static final class c extends ML0 implements Function2<JY1, CoroutineContext.Element, JY1> {
        public static final c d = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final JY1 invoke(JY1 jy1, CoroutineContext.Element element) {
            JY1 jy2 = jy1;
            CoroutineContext.Element element2 = element;
            if (element2 instanceof BY1) {
                BY1<Object> by1 = (BY1) element2;
                Object objY0 = by1.Y0(jy2.a);
                int i = jy2.d;
                jy2.b[i] = objY0;
                jy2.d = i + 1;
                jy2.c[i] = by1;
            }
            return jy2;
        }
    }

    public static final void a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof JY1)) {
            Object objR0 = coroutineContext.R0(null, c);
            Intrinsics.c(objR0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((BY1) objR0).M0(obj);
            return;
        }
        JY1 jy1 = (JY1) obj;
        BY1<Object>[] by1Arr = jy1.c;
        int length = by1Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            BY1<Object> by1 = by1Arr[length];
            Intrinsics.checkNotNull(by1);
            by1.M0(jy1.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    @NotNull
    public static final Object b(@NotNull CoroutineContext coroutineContext) {
        Object objR0 = coroutineContext.R0(0, b);
        Intrinsics.checkNotNull(objR0);
        return objR0;
    }

    @Nullable
    public static final Object c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.R0(new JY1(((Number) obj).intValue(), coroutineContext), d);
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((BY1) obj).Y0(coroutineContext);
    }
}
