package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
public final class XS extends AW1 implements Function1<JM<Object>, Object> {
    public Object d;
    public int e;
    public final /* synthetic */ IS<Object> g;
    public final /* synthetic */ CoroutineContext h;
    public final /* synthetic */ AW1 i;

    @InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<Object>, Object> {
        public int d;
        public final /* synthetic */ AW1 e;
        public final /* synthetic */ C4669jS<Object> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<Object, ? super JM<Object>, ? extends Object> function2, C4669jS<Object> c4669jS, JM<? super a> jm) {
            super(2, jm);
            this.e = (AW1) function2;
            this.g = c4669jS;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [AW1, kotlin.jvm.functions.Function2] */
        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<Object> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [AW1, kotlin.jvm.functions.Function2] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            Object obj2 = this.g.b;
            this.d = 1;
            Object objInvoke = this.e.invoke(obj2, this);
            return objInvoke == mn ? mn : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public XS(IS<Object> is, CoroutineContext coroutineContext, Function2<Object, ? super JM<Object>, ? extends Object> function2, JM<? super XS> jm) {
        super(1, jm);
        this.g = is;
        this.h = coroutineContext;
        this.i = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@NotNull JM<?> jm) {
        return new XS(this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<Object> jm) {
        return ((XS) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C4669jS c4669jS;
        Object obj2;
        int iHashCode;
        MN mn = MN.d;
        int i = this.e;
        IS<Object> is = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.e = 1;
            obj = IS.f(is, true, this);
            if (obj != mn) {
            }
            return mn;
        }
        if (i == 1) {
            C1795Pt1.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = this.d;
                C1795Pt1.b(obj);
                return obj3;
            }
            c4669jS = (C4669jS) this.d;
            C1795Pt1.b(obj);
        }
        obj2 = c4669jS.b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == c4669jS.c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!Intrinsics.a(c4669jS.b, obj)) {
            this.d = obj;
            this.e = 3;
            if (is.j(obj, true, this) == mn) {
                return mn;
            }
        }
        return obj;
        c4669jS = (C4669jS) obj;
        a aVar = new a(this.i, c4669jS, null);
        this.d = c4669jS;
        this.e = 2;
        obj = C5189lv.p(this.h, aVar, this);
        if (obj != mn) {
            obj2 = c4669jS.b;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == c4669jS.c) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!Intrinsics.a(c4669jS.b, obj)) {
                this.d = obj;
                this.e = 3;
                if (is.j(obj, true, this) == mn) {
                }
            }
            return obj;
        }
        return mn;
    }
}
