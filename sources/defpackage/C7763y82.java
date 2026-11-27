package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7763y82<T> implements InterfaceC6606sf0<T> {

    @NotNull
    public final CoroutineContext d;

    @NotNull
    public final Object e;

    @NotNull
    public final a g;

    /* JADX INFO: renamed from: y82$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<T, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6606sf0<T> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC6606sf0<? super T> interfaceC6606sf0, JM<? super a> jm) {
            super(2, jm);
            this.g = interfaceC6606sf0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            a aVar = new a(this.g, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, JM<? super Unit> jm) {
            return ((a) create(obj, jm)).invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type JM to y82$a for r3v1 'this'  JM
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                MN r0 = defpackage.MN.d
                int r1 = r3.d
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C1795Pt1.b(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                defpackage.C1795Pt1.b(r4)
                java.lang.Object r4 = r3.e
                r3.d = r2
                sf0<T> r1 = r3.g
                java.lang.Object r4 = r1.a(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                kotlin.Unit r4 = kotlin.Unit.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7763y82.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C7763y82(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull CoroutineContext coroutineContext) {
        this.d = coroutineContext;
        this.e = CY1.b(coroutineContext);
        this.g = new a(interfaceC6606sf0, null);
    }

    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) {
        Object objG = C6772tS0.g(this.d, t, this.e, this.g, jm);
        return objG == MN.d ? objG : Unit.a;
    }
}
