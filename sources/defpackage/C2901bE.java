package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2901bE<T> extends EY0<T> {
    public final long m = 3000;
    public boolean n;
    public long o;

    /* JADX INFO: renamed from: bE$a */
    public static final class a extends ML0 implements Function1<T, Unit> {
        public final /* synthetic */ C2901bE<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2901bE<T> c2901bE) {
            super(1);
            this.d = c2901bE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            C2901bE.super.i(obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: bE$b */
    public static final class b extends ML0 implements Function1<T, Unit> {
        public final /* synthetic */ C2901bE<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2901bE<T> c2901bE) {
            super(1);
            this.d = c2901bE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            C2901bE.super.k(obj);
            return Unit.a;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void i(T t) {
        p(t, new a(this));
    }

    @Override // androidx.lifecycle.LiveData
    public final void k(T t) {
        p(t, new b(this));
    }

    public final void p(T t, Function1<? super T, Unit> function1) {
        if (!this.n) {
            this.o = System.currentTimeMillis();
            this.n = true;
            function1.invoke(t);
        } else if (System.currentTimeMillis() >= this.o + this.m) {
            this.n = false;
            this.o = System.currentTimeMillis();
        }
    }
}
