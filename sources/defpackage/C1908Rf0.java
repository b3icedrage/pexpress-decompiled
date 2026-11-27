package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {149}, m = "invokeSuspend")
public final class C1908Rf0 extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6396rf0<Object> g;
    public final /* synthetic */ C3694f12 h;

    /* JADX INFO: renamed from: Rf0$a */
    public static final class a implements InterfaceC6606sf0<Object> {
        public final /* synthetic */ C3694f12 d;
        public final /* synthetic */ InterfaceC6606sf0 e;

        /* JADX INFO: renamed from: Rf0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {139}, m = "emit")
        public static final class C0137a extends LM {
            public a d;
            public /* synthetic */ Object e;
            public int g;

            public C0137a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.e = obj;
                this.g |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(C3694f12 c3694f12, InterfaceC6606sf0 interfaceC6606sf0) {
            this.d = c3694f12;
            this.e = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM<? super Unit> jm) {
            C0137a c0137a;
            a aVar;
            if (jm instanceof C0137a) {
                c0137a = (C0137a) jm;
                int i = c0137a.g;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0137a.g = i - Integer.MIN_VALUE;
                } else {
                    c0137a = new C0137a(jm);
                }
            } else {
                c0137a = new C0137a(jm);
            }
            Object objK = c0137a.e;
            MN mn = MN.d;
            int i2 = c0137a.g;
            if (i2 == 0) {
                C1795Pt1.b(objK);
                c0137a.d = this;
                c0137a.g = 1;
                objK = this.d.k(this.e, obj, c0137a);
                if (objK == mn) {
                    return mn;
                }
                aVar = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = c0137a.d;
                C1795Pt1.b(objK);
            }
            if (((Boolean) objK).booleanValue()) {
                return Unit.a;
            }
            throw new C7306w(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908Rf0(InterfaceC6396rf0 interfaceC6396rf0, C3694f12 c3694f12, JM jm) {
        super(2, jm);
        this.g = interfaceC6396rf0;
        this.h = c3694f12;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C1908Rf0 c1908Rf0 = new C1908Rf0(this.g, this.h, jm);
        c1908Rf0.e = obj;
        return c1908Rf0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C1908Rf0) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
            InterfaceC6396rf0<Object> interfaceC6396rf0 = this.g;
            a aVar2 = new a(this.h, interfaceC6606sf0);
            try {
                this.e = aVar2;
                this.d = 1;
                if (interfaceC6396rf0.c(aVar2, this) == mn) {
                    return mn;
                }
            } catch (C7306w e) {
                e = e;
                aVar = aVar2;
                if (e.d != aVar) {
                    throw e;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) this.e;
            try {
                C1795Pt1.b(obj);
            } catch (C7306w e2) {
                e = e2;
                if (e.d != aVar) {
                    throw e;
                }
            }
        }
        return Unit.a;
    }
}
