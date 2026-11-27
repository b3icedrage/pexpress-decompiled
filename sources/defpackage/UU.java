package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UU extends InterfaceC1179Hx.a {

    @Nullable
    public final Executor a;

    public class a implements InterfaceC1179Hx<Object, InterfaceC1101Gx<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // defpackage.InterfaceC1179Hx
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC1179Hx
        public final Object b(C6291r81 c6291r81) {
            Executor executor = this.b;
            return executor == null ? c6291r81 : new b(executor, c6291r81);
        }
    }

    public static final class b<T> implements InterfaceC1101Gx<T> {
        public final Executor d;
        public final InterfaceC1101Gx<T> e;

        public class a implements InterfaceC1649Nx<T> {
            public final /* synthetic */ InterfaceC1649Nx d;

            public a(InterfaceC1649Nx interfaceC1649Nx) {
                this.d = interfaceC1649Nx;
            }

            @Override // defpackage.InterfaceC1649Nx
            public final void a(InterfaceC1101Gx<T> interfaceC1101Gx, C0935Et1<T> c0935Et1) {
                b.this.d.execute(new VU(this, this.d, c0935Et1, 0));
            }

            @Override // defpackage.InterfaceC1649Nx
            public final void b(InterfaceC1101Gx<T> interfaceC1101Gx, Throwable th) {
                b.this.d.execute(new WU(this, this.d, th, 0));
            }
        }

        public b(Executor executor, InterfaceC1101Gx<T> interfaceC1101Gx) {
            this.d = executor;
            this.e = interfaceC1101Gx;
        }

        @Override // defpackage.InterfaceC1101Gx
        public final void D(InterfaceC1649Nx<T> interfaceC1649Nx) {
            this.e.D(new a(interfaceC1649Nx));
        }

        @Override // defpackage.InterfaceC1101Gx
        public final void cancel() {
            this.e.cancel();
        }

        @Override // defpackage.InterfaceC1101Gx
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1101Gx<T> clone() {
            return new b(this.d, this.e.clone());
        }

        @Override // defpackage.InterfaceC1101Gx
        public final boolean q() {
            return this.e.q();
        }

        @Override // defpackage.InterfaceC1101Gx
        public final C4543is1 u() {
            return this.e.u();
        }
    }

    public UU(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.InterfaceC1179Hx.a
    @Nullable
    public final InterfaceC1179Hx<?, ?> a(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
        if (Dc2.f(type) != InterfaceC1101Gx.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(Dc2.e(0, (ParameterizedType) type), Dc2.i(annotationArr, QM1.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
