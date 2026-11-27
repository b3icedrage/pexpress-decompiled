package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LP1<STATE, EVENT, SIDE_EFFECT> {
    public static final a c = new a();
    public final AtomicReference<STATE> a;
    public final b<STATE, EVENT, SIDE_EFFECT> b;

    public static final class a {
    }

    public static final class b<STATE, EVENT, SIDE_EFFECT> {

        @NotNull
        public final STATE a;

        @NotNull
        public final Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> b;

        @NotNull
        public final List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> c;

        public static final class a<STATE, EVENT, SIDE_EFFECT> {

            @NotNull
            public final ArrayList a = new ArrayList();

            @NotNull
            public final ArrayList b = new ArrayList();

            @NotNull
            public final LinkedHashMap<d<EVENT, EVENT>, Function2<STATE, EVENT, C0082a<STATE, SIDE_EFFECT>>> c = new LinkedHashMap<>();

            /* JADX INFO: renamed from: LP1$b$a$a, reason: collision with other inner class name */
            public static final class C0082a<STATE, SIDE_EFFECT> {

                @NotNull
                public final CP1 a;

                public C0082a(@NotNull CP1 toState) {
                    Intrinsics.d(toState, "toState");
                    this.a = toState;
                }

                public final boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C0082a) {
                        return Intrinsics.a(this.a, ((C0082a) obj).a);
                    }
                    return false;
                }

                public final int hashCode() {
                    CP1 cp1 = this.a;
                    return (cp1 != null ? cp1.hashCode() : 0) * 31;
                }

                @NotNull
                public final String toString() {
                    return "TransitionTo(toState=" + this.a + ", sideEffect=null)";
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull STATE initialState, @NotNull Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> stateDefinitions, @NotNull List<? extends Function1<? super e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onTransitionListeners) {
            Intrinsics.d(initialState, "initialState");
            Intrinsics.d(stateDefinitions, "stateDefinitions");
            Intrinsics.d(onTransitionListeners, "onTransitionListeners");
            this.a = initialState;
            this.b = stateDefinitions;
            this.c = onTransitionListeners;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.a, bVar.a) && Intrinsics.a(this.b, bVar.b) && Intrinsics.a(this.c, bVar.c);
        }

        public final int hashCode() {
            STATE state = this.a;
            int iHashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> map = this.b;
            int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> list = this.c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Graph(initialState=" + this.a + ", stateDefinitions=" + this.b + ", onTransitionListeners=" + this.c + ")";
        }
    }

    public static final class d<T, R extends T> {
        public final ArrayList a;
        public final Class<R> b;

        public static final class a extends ML0 implements Function1<T, Boolean> {
            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object it) {
                Intrinsics.d(it, "it");
                return Boolean.valueOf(d.this.b.isInstance(it));
            }
        }

        public d() {
            throw null;
        }

        public d(Class cls) {
            this.b = cls;
            this.a = WE.h(new a());
        }

        public final boolean a(@NotNull T value) {
            Intrinsics.d(value, "value");
            ArrayList arrayList = this.a;
            if (arrayList != null && arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Function1) it.next()).invoke(value)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        @NotNull
        public final void b(@NotNull Function1 predicate) {
            Intrinsics.d(predicate, "predicate");
            this.a.add(new E90(predicate));
        }
    }

    public static abstract class e<STATE, EVENT, SIDE_EFFECT> {

        public static final class a<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {

            @NotNull
            public final STATE a;

            @NotNull
            public final AbstractC2882b80 b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@NotNull Object obj, @NotNull AbstractC2882b80 event) {
                Intrinsics.d(event, "event");
                this.a = obj;
                this.b = event;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
            }

            public final int hashCode() {
                STATE state = this.a;
                int iHashCode = (state != null ? state.hashCode() : 0) * 31;
                AbstractC2882b80 abstractC2882b80 = this.b;
                return iHashCode + (abstractC2882b80 != null ? abstractC2882b80.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "Invalid(fromState=" + this.a + ", event=" + this.b + ")";
            }
        }

        public static final class b<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {

            @NotNull
            public final STATE a;

            @NotNull
            public final AbstractC2882b80 b;

            @NotNull
            public final CP1 c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@NotNull Object obj, @NotNull AbstractC2882b80 event, @NotNull CP1 toState) {
                Intrinsics.d(event, "event");
                Intrinsics.d(toState, "toState");
                this.a = obj;
                this.b = event;
                this.c = toState;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.a(this.a, bVar.a) && Intrinsics.a(this.b, bVar.b) && Intrinsics.a(this.c, bVar.c);
            }

            public final int hashCode() {
                STATE state = this.a;
                int iHashCode = (state != null ? state.hashCode() : 0) * 31;
                AbstractC2882b80 abstractC2882b80 = this.b;
                int iHashCode2 = (iHashCode + (abstractC2882b80 != null ? abstractC2882b80.hashCode() : 0)) * 31;
                CP1 cp1 = this.c;
                return (iHashCode2 + (cp1 != null ? cp1.hashCode() : 0)) * 31;
            }

            @NotNull
            public final String toString() {
                return "Valid(fromState=" + this.a + ", event=" + this.b + ", toState=" + this.c + ", sideEffect=null)";
            }
        }
    }

    public LP1(b bVar) {
        this.b = bVar;
        this.a = new AtomicReference<>(bVar.a);
    }

    public final b.a<STATE, EVENT, SIDE_EFFECT> a(@NotNull STATE state) {
        Map<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> map = this.b.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> entry : map.entrySet()) {
            if (entry.getKey().a(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b.a) ((Map.Entry) it.next()).getValue());
        }
        b.a<STATE, EVENT, SIDE_EFFECT> aVar = (b.a) CollectionsKt.firstOrNull(arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Missing definition for state " + state.getClass().getSimpleName() + '!').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e b(@NotNull Object obj, AbstractC2882b80 abstractC2882b80) {
        for (Map.Entry<d<EVENT, EVENT>, Function2<STATE, EVENT, b.a.C0082a<STATE, SIDE_EFFECT>>> entry : a(obj).c.entrySet()) {
            d<EVENT, EVENT> key = entry.getKey();
            Function2<STATE, EVENT, b.a.C0082a<STATE, SIDE_EFFECT>> value = entry.getValue();
            if (key.a(abstractC2882b80)) {
                return new e.b(obj, abstractC2882b80, value.invoke(obj, abstractC2882b80).a);
            }
        }
        return new e.a(obj, abstractC2882b80);
    }

    public static final class c<STATE, EVENT, SIDE_EFFECT> {
        public STATE a;
        public final LinkedHashMap<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> b;
        public final ArrayList<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> c;

        public final class a<S extends STATE> {
            public final b.a<STATE, EVENT, SIDE_EFFECT> a = new b.a<>();

            /* JADX INFO: renamed from: LP1$c$a$a, reason: collision with other inner class name */
            public static final class C0083a extends ML0 implements Function2<STATE, EVENT, b.a.C0082a<? extends STATE, ? extends SIDE_EFFECT>> {
                public final /* synthetic */ ML0 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0083a(Function2 function2) {
                    super(2);
                    this.d = (ML0) function2;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [ML0, kotlin.jvm.functions.Function2] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object state, Object event) {
                    Intrinsics.d(state, "state");
                    Intrinsics.d(event, "event");
                    return (b.a.C0082a) this.d.invoke(state, event);
                }
            }

            @NotNull
            public static b.a.C0082a a(a aVar, CP1 receiver$0) {
                aVar.getClass();
                Intrinsics.d(receiver$0, "receiver$0");
                return new b.a.C0082a(receiver$0);
            }

            @NotNull
            public static b.a.C0082a d(a aVar, Object receiver$0, CP1 state) {
                aVar.getClass();
                Intrinsics.d(receiver$0, "receiver$0");
                Intrinsics.d(state, "state");
                return new b.a.C0082a(state);
            }

            public final <E extends EVENT> void b(@NotNull d<EVENT, ? extends E> dVar, @NotNull Function2<? super S, ? super E, ? extends b.a.C0082a<? extends STATE, ? extends SIDE_EFFECT>> function2) {
                this.a.c.put(dVar, new C0083a(function2));
            }

            public final void c(@NotNull Function2 function2) {
                this.a.a.add(new MP1(function2));
            }
        }

        public c(int i) {
            this.a = null;
            this.b = new LinkedHashMap<>(PW0.c());
            this.c = new ArrayList<>(C5653o60.d);
        }

        public final <S extends STATE> void a(@NotNull d<STATE, ? extends S> dVar, @NotNull Function1<? super c<STATE, EVENT, SIDE_EFFECT>.a<S>, Unit> init) {
            Intrinsics.d(init, "init");
            LinkedHashMap<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.b;
            a aVar = new a();
            init.invoke(aVar);
            linkedHashMap.put(dVar, aVar.a);
        }

        public c() {
            this(0);
        }
    }
}
