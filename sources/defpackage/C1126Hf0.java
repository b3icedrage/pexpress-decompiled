package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1126Hf0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ InterfaceC6396rf0 d;
    public final /* synthetic */ AW1 e;

    /* JADX INFO: renamed from: Hf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {113, 120, 127}, m = "collect")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public Object h;
        public InterfaceC6606sf0 i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1126Hf0.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1126Hf0(InterfaceC6396rf0 interfaceC6396rf0, InterfaceC1060Gj0 interfaceC1060Gj0) {
        this.d = interfaceC6396rf0;
        this.e = (AW1) interfaceC1060Gj0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [AW1, Gj0] */
    /* JADX WARN: Type inference failed for: r9v6, types: [AW1, Gj0] */
    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM<? super Unit> jm) throws Throwable {
        a aVar;
        C1126Hf0 c1126Hf0;
        TY1 ty1;
        ?? r2;
        C2897bC1 c2897bC1;
        Throwable th;
        C2897bC1 c2897bC2;
        ?? r9;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            try {
                InterfaceC6396rf0 interfaceC6396rf0 = this.d;
                aVar.h = this;
                aVar.i = interfaceC6606sf0;
                aVar.e = 1;
                if (interfaceC6396rf0.c(interfaceC6606sf0, aVar) != mn) {
                    c1126Hf0 = this;
                    c2897bC1 = new C2897bC1(interfaceC6606sf0, aVar.getContext());
                    r9 = c1126Hf0.e;
                    aVar.h = c2897bC1;
                    aVar.i = null;
                    aVar.e = 3;
                    if (r9.k(c2897bC1, null, aVar) != mn) {
                        c2897bC2 = c2897bC1;
                        c2897bC2.releaseIntercepted();
                        return Unit.a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c1126Hf0 = this;
                ty1 = new TY1(th);
                r2 = c1126Hf0.e;
                aVar.h = th;
                aVar.i = null;
                aVar.e = 2;
                if (C0957Fb.c(ty1, r2, th, aVar) == mn) {
                    throw th;
                }
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) aVar.h;
                C1795Pt1.b(obj);
                throw th3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2897bC2 = (C2897bC1) aVar.h;
            try {
                C1795Pt1.b(obj);
                c2897bC2.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th4) {
                th = th4;
                c2897bC2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC6606sf0 = aVar.i;
        c1126Hf0 = (C1126Hf0) aVar.h;
        try {
            C1795Pt1.b(obj);
            c2897bC1 = new C2897bC1(interfaceC6606sf0, aVar.getContext());
            try {
                r9 = c1126Hf0.e;
                aVar.h = c2897bC1;
                aVar.i = null;
                aVar.e = 3;
                if (r9.k(c2897bC1, null, aVar) != mn) {
                    c2897bC2 = c2897bC1;
                    c2897bC2.releaseIntercepted();
                    return Unit.a;
                }
            } catch (Throwable th5) {
                th = th5;
                c2897bC2 = c2897bC1;
                c2897bC2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            ty1 = new TY1(th);
            r2 = c1126Hf0.e;
            aVar.h = th;
            aVar.i = null;
            aVar.e = 2;
            if (C0957Fb.c(ty1, r2, th, aVar) == mn) {
                throw th;
            }
        }
        return mn;
    }
}
