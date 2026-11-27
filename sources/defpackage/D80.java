package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D80<T> {

    public static final class a {
        public static final Type a(ParameterizedType getParameterUpperBound) {
            Intrinsics.checkNotNullParameter(getParameterUpperBound, "$this$getParameterUpperBound");
            Type[] actualTypeArguments = getParameterUpperBound.getActualTypeArguments();
            if (actualTypeArguments.length > 0) {
                Type type = actualTypeArguments[0];
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                Intrinsics.checkNotNullExpressionValue(type, "Utils.getParameterUpperBound(index, this)");
                return type;
            }
            throw new IllegalArgumentException("Index 0 not in range [0," + actualTypeArguments.length + ") for " + getParameterUpperBound);
        }
    }

    public static final class b {
        public final LinkedHashMap a;
        public final C7003uZ0 b;

        public b(@NotNull C7003uZ0 messageAdapterResolver) {
            Intrinsics.checkNotNullParameter(messageAdapterResolver, "messageAdapterResolver");
            this.b = messageAdapterResolver;
            this.a = new LinkedHashMap();
        }
    }

    public static final class c<E extends AbstractC2882b80> extends D80<E> {
        public final Class<E> a;

        public c(@NotNull Class<E> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            this.a = clazz;
        }

        @Override // defpackage.D80
        @NotNull
        public final YX0<E> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!this.a.isInstance(event)) {
                ZX0 zx0 = ZX0.d;
                Intrinsics.checkNotNullExpressionValue(zx0, "Maybe.empty()");
                return zx0;
            }
            C1589Ne.r(event, "item is null");
            CallableC2962bY0 callableC2962bY0 = new CallableC2962bY0(event);
            Intrinsics.checkNotNullExpressionValue(callableC2962bY0, "Maybe.just(event as E)");
            return callableC2962bY0;
        }
    }

    public static final class d extends D80<Object> {

        @NotNull
        public static final d a = new d();

        @Override // defpackage.D80
        @NotNull
        public final YX0<Object> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C1589Ne.r(event, "item is null");
            CallableC2962bY0 callableC2962bY0 = new CallableC2962bY0(event);
            Intrinsics.checkNotNullExpressionValue(callableC2962bY0, "Maybe.just(event)");
            return callableC2962bY0;
        }
    }

    public static final class e<T> extends D80<AbstractC5953pZ<T>> {
        public final i a;
        public final InterfaceC6793tZ0<T> b;

        public static final class a<T> implements InterfaceC5352mg1<Pf2.a> {
            public static final a d = new a();

            @Override // defpackage.InterfaceC5352mg1
            public final boolean test(Pf2.a aVar) {
                Pf2.a it = aVar;
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof Pf2.a.e;
            }
        }

        public static final class b<T, R> implements InterfaceC0748Cj0<Pf2.a, AbstractC5953pZ<T>> {
            public b() {
            }

            @Override // defpackage.InterfaceC0748Cj0
            public final Object apply(Pf2.a aVar) {
                Pf2.a it = aVar;
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC6583sZ0 abstractC6583sZ0 = ((Pf2.a.e) it).a;
                e eVar = e.this;
                eVar.getClass();
                try {
                    return new AbstractC5953pZ.b(eVar.b.b(abstractC6583sZ0));
                } catch (Throwable th) {
                    return new AbstractC5953pZ.a(th);
                }
            }
        }

        public e(@NotNull InterfaceC6793tZ0<T> messageAdapter) {
            Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
            this.b = messageAdapter;
            this.a = i.b;
        }

        @Override // defpackage.D80
        @NotNull
        public final YX0<AbstractC5953pZ<T>> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3171cY0 c3171cY0 = new C3171cY0(new C2738aY0(this.a.a(event), a.d), new b());
            Intrinsics.checkNotNullExpressionValue(c3171cY0, "toWebSocketEvent.mapToDa…).message.deserialize() }");
            return c3171cY0;
        }
    }

    public static final class f<T> extends D80<T> {
        public final e<T> a;

        public static final class a<T> implements InterfaceC5352mg1<AbstractC5953pZ<T>> {
            public static final a d = new a();

            @Override // defpackage.InterfaceC5352mg1
            public final boolean test(Object obj) {
                AbstractC5953pZ it = (AbstractC5953pZ) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof AbstractC5953pZ.b;
            }
        }

        public static final class b<T, R> implements InterfaceC0748Cj0<AbstractC5953pZ<T>, T> {
            public static final b d = new b();

            @Override // defpackage.InterfaceC0748Cj0
            public final Object apply(Object obj) {
                AbstractC5953pZ it = (AbstractC5953pZ) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((AbstractC5953pZ.b) it).a;
            }
        }

        public f(@NotNull e<T> toDeserialization) {
            Intrinsics.checkNotNullParameter(toDeserialization, "toDeserialization");
            this.a = toDeserialization;
        }

        @Override // defpackage.D80
        @NotNull
        public final YX0<T> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3171cY0 c3171cY0 = new C3171cY0(new C2738aY0(this.a.a(event), a.d), b.d);
            Intrinsics.checkNotNullExpressionValue(c3171cY0, "toDeserialization.mapToD…lization.Success).value }");
            return c3171cY0;
        }
    }

    public static final class g extends D80<InterfaceC7394wP0.a> {

        @NotNull
        public static final g b = new g();
        public static final c<AbstractC2882b80.a.C0249a<?>> a = new c<>(AbstractC2882b80.a.C0249a.class);

        public static final class a<T, R> implements InterfaceC0748Cj0<AbstractC2882b80.a.C0249a<?>, InterfaceC7394wP0.a> {
            public static final a d = new a();

            @Override // defpackage.InterfaceC0748Cj0
            public final InterfaceC7394wP0.a apply(AbstractC2882b80.a.C0249a<?> c0249a) {
                AbstractC2882b80.a.C0249a<?> it = c0249a;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.a;
            }
        }

        @Override // defpackage.D80
        @NotNull
        public final YX0<InterfaceC7394wP0.a> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            YX0<E> yx0A = a.a(event);
            a aVar = a.d;
            yx0A.getClass();
            C3171cY0 c3171cY0 = new C3171cY0(yx0A, aVar);
            Intrinsics.checkNotNullExpressionValue(c3171cY0, "filterEventType.mapToData(event).map { it.state }");
            return c3171cY0;
        }
    }

    public static final class h extends D80<CP1> {

        @NotNull
        public static final h b = new h();
        public static final c<AbstractC2882b80.c<?>> a = new c<>(AbstractC2882b80.c.class);

        public static final class a<T, R> implements InterfaceC0748Cj0<AbstractC2882b80.c<?>, CP1> {
            public static final a d = new a();

            @Override // defpackage.InterfaceC0748Cj0
            public final CP1 apply(AbstractC2882b80.c<?> cVar) {
                AbstractC2882b80.c<?> it = cVar;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.a;
            }
        }

        @Override // defpackage.D80
        @NotNull
        public final YX0<CP1> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            YX0<E> yx0A = a.a(event);
            a aVar = a.d;
            yx0A.getClass();
            C3171cY0 c3171cY0 = new C3171cY0(yx0A, aVar);
            Intrinsics.checkNotNullExpressionValue(c3171cY0, "filterEventType.mapToData(event).map { it.state }");
            return c3171cY0;
        }
    }

    public static final class i extends D80<Pf2.a> {

        @NotNull
        public static final i b = new i();
        public static final c<AbstractC2882b80.d.a<?>> a = new c<>(AbstractC2882b80.d.a.class);

        public static final class a<T, R> implements InterfaceC0748Cj0<AbstractC2882b80.d.a<?>, Pf2.a> {
            public static final a d = new a();

            @Override // defpackage.InterfaceC0748Cj0
            public final Pf2.a apply(AbstractC2882b80.d.a<?> aVar) {
                AbstractC2882b80.d.a<?> it = aVar;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.a;
            }
        }

        @Override // defpackage.D80
        @NotNull
        public final YX0<Pf2.a> a(@NotNull AbstractC2882b80 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            YX0<E> yx0A = a.a(event);
            a aVar = a.d;
            yx0A.getClass();
            C3171cY0 c3171cY0 = new C3171cY0(yx0A, aVar);
            Intrinsics.checkNotNullExpressionValue(c3171cY0, "filterEventType.mapToData(event).map { it.event }");
            return c3171cY0;
        }
    }

    @NotNull
    public abstract YX0<T> a(@NotNull AbstractC2882b80 abstractC2882b80);
}
