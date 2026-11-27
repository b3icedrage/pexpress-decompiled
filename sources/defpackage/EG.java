package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class EG extends InterfaceC1179Hx.a {
    public static final EG a = new EG();

    @IgnoreJRERequirement
    public static final class a<R> implements InterfaceC1179Hx<R, CompletableFuture<R>> {
        public final Type a;

        /* JADX INFO: renamed from: EG$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0022a implements InterfaceC1649Nx<R> {
            public final b d;

            public C0022a(b bVar) {
                this.d = bVar;
            }

            @Override // defpackage.InterfaceC1649Nx
            public final void a(InterfaceC1101Gx<R> interfaceC1101Gx, C0935Et1<R> c0935Et1) {
                boolean zG = c0935Et1.a.g();
                b bVar = this.d;
                if (zG) {
                    bVar.complete(c0935Et1.b);
                } else {
                    bVar.completeExceptionally(new C6437rq0(c0935Et1));
                }
            }

            @Override // defpackage.InterfaceC1649Nx
            public final void b(InterfaceC1101Gx<R> interfaceC1101Gx, Throwable th) {
                this.d.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // defpackage.InterfaceC1179Hx
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC1179Hx
        public final Object b(C6291r81 c6291r81) {
            b bVar = new b(c6291r81);
            c6291r81.D(new C0022a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {
        public final C6291r81 d;

        public b(C6291r81 c6291r81) {
            this.d = c6291r81;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.d.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements InterfaceC1179Hx<R, CompletableFuture<C0935Et1<R>>> {
        public final Type a;

        @IgnoreJRERequirement
        public class a implements InterfaceC1649Nx<R> {
            public final b d;

            public a(b bVar) {
                this.d = bVar;
            }

            @Override // defpackage.InterfaceC1649Nx
            public final void a(InterfaceC1101Gx<R> interfaceC1101Gx, C0935Et1<R> c0935Et1) {
                this.d.complete(c0935Et1);
            }

            @Override // defpackage.InterfaceC1649Nx
            public final void b(InterfaceC1101Gx<R> interfaceC1101Gx, Throwable th) {
                this.d.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // defpackage.InterfaceC1179Hx
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC1179Hx
        public final Object b(C6291r81 c6291r81) {
            b bVar = new b(c6291r81);
            c6291r81.D(new a(bVar));
            return bVar;
        }
    }

    @Override // defpackage.InterfaceC1179Hx.a
    @Nullable
    public final InterfaceC1179Hx<?, ?> a(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
        if (Dc2.f(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeE = Dc2.e(0, (ParameterizedType) type);
        if (Dc2.f(typeE) != C0935Et1.class) {
            return new a(typeE);
        }
        if (typeE instanceof ParameterizedType) {
            return new c(Dc2.e(0, (ParameterizedType) typeE));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
