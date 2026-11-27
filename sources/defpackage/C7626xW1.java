package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7626xW1<TSubject, TContext> extends AbstractC1121Hd1<TSubject, TContext> {

    @NotNull
    public final List<InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, TContext>, TSubject, JM<? super Unit>, Object>> e;

    @NotNull
    public final a g;

    @NotNull
    public TSubject h;

    @NotNull
    public final JM<TSubject>[] i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: xW1$a */
    public static final class a implements JM<Unit>, NN {
        public int d = Integer.MIN_VALUE;
        public final /* synthetic */ C7626xW1<TSubject, TContext> e;

        public a(C7626xW1<TSubject, TContext> c7626xW1) {
            this.e = c7626xW1;
        }

        @Override // defpackage.NN
        @Nullable
        public final NN getCallerFrame() {
            JM<TSubject> jm = YO1.d;
            int i = this.d;
            C7626xW1<TSubject, TContext> c7626xW1 = this.e;
            if (i == Integer.MIN_VALUE) {
                this.d = c7626xW1.j;
            }
            int i2 = this.d;
            if (i2 < 0) {
                this.d = Integer.MIN_VALUE;
                jm = null;
            } else {
                try {
                    JM<TSubject> jm2 = c7626xW1.i[i2];
                    if (jm2 != null) {
                        this.d = i2 - 1;
                        jm = jm2;
                    }
                } catch (Throwable unused) {
                }
            }
            if (jm instanceof NN) {
                return (NN) jm;
            }
            return null;
        }

        @Override // defpackage.JM
        @NotNull
        public final CoroutineContext getContext() {
            C7626xW1<TSubject, TContext> c7626xW1 = this.e;
            JM<TSubject>[] jmArr = c7626xW1.i;
            int i = c7626xW1.j;
            JM<TSubject> jm = jmArr[i];
            if (jm != this && jm != null) {
                return jm.getContext();
            }
            int i2 = i - 1;
            while (i2 >= 0) {
                int i3 = i2 - 1;
                JM<TSubject> jm2 = c7626xW1.i[i2];
                if (jm2 != this && jm2 != null) {
                    return jm2.getContext();
                }
                i2 = i3;
            }
            throw new IllegalStateException("Not started");
        }

        @Override // defpackage.JM
        public final void resumeWith(@NotNull Object obj) {
            C1717Ot1.a aVar = C1717Ot1.e;
            boolean z = obj instanceof C1717Ot1.b;
            C7626xW1<TSubject, TContext> c7626xW1 = this.e;
            if (!z) {
                c7626xW1.e(false);
                return;
            }
            Throwable thA = C1717Ot1.a(obj);
            Intrinsics.checkNotNull(thA);
            c7626xW1.g(C1795Pt1.a(thA));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7626xW1(@NotNull TSubject initial, @NotNull TContext context, @NotNull List<? extends InterfaceC1060Gj0<? super AbstractC1121Hd1<TSubject, TContext>, ? super TSubject, ? super JM<? super Unit>, ? extends Object>> blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.e = blocks;
        this.g = new a(this);
        this.h = initial;
        this.i = new JM[blocks.size()];
        this.j = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1121Hd1
    @Nullable
    public final Object a(@NotNull Object obj, @NotNull LM lm) {
        this.k = 0;
        if (this.e.size() == 0) {
            return obj;
        }
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.h = obj;
        if (this.j < 0) {
            return c(lm);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // defpackage.AbstractC1121Hd1
    @NotNull
    public final TSubject b() {
        return this.h;
    }

    @Override // defpackage.AbstractC1121Hd1
    @Nullable
    public final Object c(@NotNull JM<? super TSubject> frame) {
        Object obj;
        if (this.k == this.e.size()) {
            obj = this.h;
        } else {
            JM<TSubject> continuation = C5885pC0.b(frame);
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            int i = this.j + 1;
            this.j = i;
            JM<TSubject>[] jmArr = this.i;
            jmArr[i] = continuation;
            if (e(true)) {
                int i2 = this.j;
                if (i2 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.j = i2 - 1;
                jmArr[i2] = null;
                obj = this.h;
            } else {
                obj = MN.d;
            }
        }
        if (obj == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1121Hd1
    @Nullable
    public final Object d(@NotNull JM jm, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.h = obj;
        return c(jm);
    }

    public final boolean e(boolean z) {
        int i;
        List<InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, TContext>, TSubject, JM<? super Unit>, Object>> list;
        do {
            i = this.k;
            list = this.e;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                C1717Ot1.a aVar = C1717Ot1.e;
                g(this.h);
                return false;
            }
            this.k = i + 1;
            try {
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                g(C1795Pt1.a(th));
                return false;
            }
        } while (list.get(i).k(this, this.h, this.g) != MN.d);
        return false;
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.g.getContext();
    }

    public final void g(Object obj) {
        Throwable thB;
        int i = this.j;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        JM<TSubject>[] jmArr = this.i;
        JM<TSubject> continuation = jmArr[i];
        Intrinsics.checkNotNull(continuation);
        int i2 = this.j;
        this.j = i2 - 1;
        jmArr[i2] = null;
        C1717Ot1.a aVar = C1717Ot1.e;
        if (!(obj instanceof C1717Ot1.b)) {
            continuation.resumeWith(obj);
            return;
        }
        Throwable exception = C1717Ot1.a(obj);
        Intrinsics.checkNotNull(exception);
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            Throwable cause = exception.getCause();
            Intrinsics.checkNotNullParameter(exception, "<this>");
            if (cause != null && !Intrinsics.a(exception.getCause(), cause) && (thB = I90.b(exception, cause)) != null) {
                thB.setStackTrace(exception.getStackTrace());
                exception = thB;
            }
        } catch (Throwable unused) {
        }
        C1717Ot1.a aVar2 = C1717Ot1.e;
        continuation.resumeWith(C1795Pt1.a(exception));
    }
}
