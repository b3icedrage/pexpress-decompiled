package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
public final class HS extends AW1 implements Function1<JM<? super C4669jS<Object>>, Object> {
    public Object d;
    public Serializable e;
    public Object g;
    public Object h;
    public Iterator i;
    public int j;
    public int k;
    public final /* synthetic */ IS<Object> l;
    public final /* synthetic */ IS<Object>.a m;

    public static final class a implements InterfaceC6089qA0<Object> {
        public final /* synthetic */ InterfaceC4117h21 a;
        public final /* synthetic */ C2512Yo1 b;
        public final /* synthetic */ C3027bp1<Object> c;
        public final /* synthetic */ IS<Object> d;

        public a(InterfaceC4117h21 interfaceC4117h21, C2512Yo1 c2512Yo1, C3027bp1<Object> c3027bp1, IS<Object> is) {
            this.a = interfaceC4117h21;
            this.b = c2512Yo1;
            this.c = c3027bp1;
            this.d = is;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC6089qA0
        @Nullable
        public final Object a(@NotNull C7822yS c7822yS, @NotNull LM lm) throws Throwable {
            GS gs;
            InterfaceC4117h21 interfaceC4117h21;
            IS<Object> is;
            C2512Yo1 c2512Yo1;
            C3027bp1<Object> c3027bp1;
            Function2 function2;
            InterfaceC4117h21 interfaceC4117h22;
            InterfaceC4117h21 interfaceC4117h23;
            IS<Object> is2;
            T t;
            C3027bp1<Object> c3027bp2;
            if (lm instanceof GS) {
                gs = (GS) lm;
                int i = gs.l;
                if ((i & Integer.MIN_VALUE) != 0) {
                    gs.l = i - Integer.MIN_VALUE;
                } else {
                    gs = new GS(this, lm);
                }
            } else {
                gs = new GS(this, lm);
            }
            Object obj = gs.j;
            MN mn = MN.d;
            int i2 = gs.l;
            try {
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    gs.d = c7822yS;
                    interfaceC4117h21 = this.a;
                    gs.e = interfaceC4117h21;
                    C2512Yo1 c2512Yo2 = this.b;
                    gs.g = c2512Yo2;
                    C3027bp1<Object> c3027bp3 = this.c;
                    gs.h = c3027bp3;
                    is = this.d;
                    gs.i = is;
                    gs.l = 1;
                    if (interfaceC4117h21.a(gs) != mn) {
                        c2512Yo1 = c2512Yo2;
                        c3027bp1 = c3027bp3;
                        function2 = c7822yS;
                    }
                    return mn;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = gs.g;
                        c3027bp2 = (C3027bp1) gs.e;
                        interfaceC4117h22 = (InterfaceC4117h21) gs.d;
                        try {
                            C1795Pt1.b(obj);
                            t = obj2;
                            c3027bp2.d = t;
                            c3027bp1 = c3027bp2;
                            Object obj3 = c3027bp1.d;
                            interfaceC4117h22.b(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC4117h22.b(null);
                            throw th;
                        }
                    }
                    is2 = (IS) gs.g;
                    c3027bp1 = (C3027bp1) gs.e;
                    interfaceC4117h23 = (InterfaceC4117h21) gs.d;
                    try {
                        C1795Pt1.b(obj);
                        if (!Intrinsics.a(obj, c3027bp1.d)) {
                            gs.d = interfaceC4117h23;
                            gs.e = c3027bp1;
                            gs.g = obj;
                            gs.l = 3;
                            if (is2.j(obj, false, gs) != mn) {
                                t = obj;
                                c3027bp2 = c3027bp1;
                                interfaceC4117h22 = interfaceC4117h23;
                                c3027bp2.d = t;
                                c3027bp1 = c3027bp2;
                            }
                            return mn;
                        }
                        interfaceC4117h22 = interfaceC4117h23;
                        Object obj4 = c3027bp1.d;
                        interfaceC4117h22.b(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC4117h22 = interfaceC4117h23;
                        interfaceC4117h22.b(null);
                        throw th;
                    }
                }
                IS<Object> is3 = gs.i;
                c3027bp1 = gs.h;
                c2512Yo1 = (C2512Yo1) gs.g;
                InterfaceC4117h21 interfaceC4117h24 = (InterfaceC4117h21) gs.e;
                Function2 function3 = (Function2) gs.d;
                C1795Pt1.b(obj);
                is = is3;
                function2 = function3;
                interfaceC4117h21 = interfaceC4117h24;
                if (c2512Yo1.d) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj5 = c3027bp1.d;
                gs.d = interfaceC4117h21;
                gs.e = c3027bp1;
                gs.g = is;
                gs.h = null;
                gs.i = null;
                gs.l = 2;
                Object objInvoke = function2.invoke(obj5, gs);
                if (objInvoke != mn) {
                    interfaceC4117h23 = interfaceC4117h21;
                    obj = objInvoke;
                    is2 = is;
                    if (!Intrinsics.a(obj, c3027bp1.d)) {
                        gs.d = interfaceC4117h23;
                        gs.e = c3027bp1;
                        gs.g = obj;
                        gs.l = 3;
                        if (is2.j(obj, false, gs) != mn) {
                            t = obj;
                            c3027bp2 = c3027bp1;
                            interfaceC4117h22 = interfaceC4117h23;
                            c3027bp2.d = t;
                            c3027bp1 = c3027bp2;
                        }
                    } else {
                        interfaceC4117h22 = interfaceC4117h23;
                    }
                    Object obj6 = c3027bp1.d;
                    interfaceC4117h22.b(null);
                    return obj6;
                }
                return mn;
            } catch (Throwable th3) {
                th = th3;
                interfaceC4117h22 = interfaceC4117h21;
                interfaceC4117h22.b(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HS(IS<Object> is, IS<Object>.a aVar, JM<? super HS> jm) {
        super(1, jm);
        this.l = is;
        this.m = aVar;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@NotNull JM<?> jm) {
        return new HS(this.l, this.m, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super C4669jS<Object>> jm) {
        return ((HS) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009e->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws VN {
        InterfaceC4117h21 interfaceC4117h21C;
        C2512Yo1 c2512Yo1;
        C3027bp1 c3027bp1;
        C3027bp1 c3027bp2;
        InterfaceC4117h21 interfaceC4117h21;
        Iterator it;
        InterfaceC4117h21 interfaceC4117h22;
        C2512Yo1 c2512Yo2;
        C3027bp1 c3027bp3;
        a aVar;
        C3027bp1 c3027bp4;
        C2512Yo1 c2512Yo3;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Integer numE;
        int i;
        MN mn = MN.d;
        int i2 = this.k;
        IS<Object>.a aVar2 = this.m;
        IS<Object> is = this.l;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            interfaceC4117h21C = ED.c();
            c2512Yo1 = new C2512Yo1();
            c3027bp1 = new C3027bp1();
            this.d = interfaceC4117h21C;
            this.e = c2512Yo1;
            this.g = c3027bp1;
            this.h = c3027bp1;
            this.k = 1;
            obj = IS.f(is, true, this);
            if (obj != mn) {
                c3027bp2 = c3027bp1;
            }
            return mn;
        }
        if (i2 == 1) {
            c3027bp1 = (C3027bp1) this.h;
            c3027bp2 = (C3027bp1) this.g;
            c2512Yo1 = (C2512Yo1) this.e;
            interfaceC4117h21C = (InterfaceC4117h21) this.d;
            C1795Pt1.b(obj);
        } else {
            if (i2 == 2) {
                it = this.i;
                aVar = (a) this.h;
                c3027bp3 = (C3027bp1) this.g;
                c2512Yo2 = (C2512Yo1) this.e;
                interfaceC4117h22 = (InterfaceC4117h21) this.d;
                C1795Pt1.b(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.d = interfaceC4117h22;
                    this.e = c2512Yo2;
                    this.g = c3027bp3;
                    this.h = aVar;
                    this.i = it;
                    this.k = 2;
                    if (function2.invoke(aVar, this) == mn) {
                        return mn;
                    }
                }
                c3027bp2 = c3027bp3;
                c2512Yo1 = c2512Yo2;
                interfaceC4117h21 = interfaceC4117h22;
                aVar2.c = null;
                this.d = c2512Yo1;
                this.e = c3027bp2;
                this.g = interfaceC4117h21;
                this.h = null;
                this.i = null;
                this.k = 3;
                if (interfaceC4117h21.a(this) != mn) {
                    c3027bp4 = c3027bp2;
                    c2512Yo3 = c2512Yo1;
                    c2512Yo3.d = true;
                    Unit unit = Unit.a;
                    interfaceC4117h21.b(null);
                    obj2 = c3027bp4.d;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    SB0 sb0G = is.g();
                    this.d = obj2;
                    this.e = null;
                    this.g = null;
                    this.j = iHashCode;
                    this.k = 4;
                    numE = sb0G.e();
                    if (numE != mn) {
                        i = iHashCode;
                        obj = numE;
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                interfaceC4117h21 = (InterfaceC4117h21) this.g;
                c3027bp4 = (C3027bp1) this.e;
                c2512Yo3 = (C2512Yo1) this.d;
                C1795Pt1.b(obj);
                try {
                    c2512Yo3.d = true;
                    Unit unit2 = Unit.a;
                    interfaceC4117h21.b(null);
                    obj2 = c3027bp4.d;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    SB0 sb0G2 = is.g();
                    this.d = obj2;
                    this.e = null;
                    this.g = null;
                    this.j = iHashCode;
                    this.k = 4;
                    numE = sb0G2.e();
                    if (numE != mn) {
                        i = iHashCode;
                        obj = numE;
                    }
                    return mn;
                } catch (Throwable th) {
                    interfaceC4117h21.b(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.j;
            obj2 = this.d;
            C1795Pt1.b(obj);
        }
        return new C4669jS(obj2, i, ((Number) obj).intValue());
        c3027bp1.d = ((C4669jS) obj).b;
        a aVar3 = new a(interfaceC4117h21C, c2512Yo1, c3027bp2, is);
        List<? extends Function2<? super InterfaceC6089qA0<Object>, ? super JM<? super Unit>, ? extends Object>> list = aVar2.c;
        if (list != null) {
            it = list.iterator();
            interfaceC4117h22 = interfaceC4117h21C;
            c2512Yo2 = c2512Yo1;
            c3027bp3 = c3027bp2;
            aVar = aVar3;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.d = interfaceC4117h22;
                this.e = c2512Yo2;
                this.g = c3027bp3;
                this.h = aVar;
                this.i = it;
                this.k = 2;
                if (function2.invoke(aVar, this) == mn) {
                    return mn;
                }
            }
            c3027bp2 = c3027bp3;
            c2512Yo1 = c2512Yo2;
            interfaceC4117h21 = interfaceC4117h22;
        } else {
            interfaceC4117h21 = interfaceC4117h21C;
        }
        aVar2.c = null;
        this.d = c2512Yo1;
        this.e = c3027bp2;
        this.g = interfaceC4117h21;
        this.h = null;
        this.i = null;
        this.k = 3;
        if (interfaceC4117h21.a(this) != mn) {
            c3027bp4 = c3027bp2;
            c2512Yo3 = c2512Yo1;
            c2512Yo3.d = true;
            Unit unit3 = Unit.a;
            interfaceC4117h21.b(null);
            obj2 = c3027bp4.d;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            SB0 sb0G3 = is.g();
            this.d = obj2;
            this.e = null;
            this.g = null;
            this.j = iHashCode;
            this.k = 4;
            numE = sb0G3.e();
            if (numE != mn) {
                i = iHashCode;
                obj = numE;
                return new C4669jS(obj2, i, ((Number) obj).intValue());
            }
        }
        return mn;
    }
}
