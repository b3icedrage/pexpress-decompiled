package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.BBandsDirectionCalculator$indicationBBand$$inlined$transform$1", f = "BBandsDirectionCalculator.kt", l = {36}, m = "invokeSuspend")
public final class C3025bp extends AW1 implements Function2<InterfaceC6606sf0<? super H32.a>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ C3027bp1 h;
    public final /* synthetic */ C3443dp i;
    public final /* synthetic */ I10 j;
    public final /* synthetic */ C3863fp.a k;
    public final /* synthetic */ C4283hp l;

    /* JADX INFO: renamed from: bp$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0<H32.a> d;
        public final /* synthetic */ C3027bp1 e;
        public final /* synthetic */ C3443dp g;
        public final /* synthetic */ C3863fp.a h;
        public final /* synthetic */ C4283hp i;

        /* JADX INFO: renamed from: bp$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.BBandsDirectionCalculator$indicationBBand$$inlined$transform$1$1", f = "BBandsDirectionCalculator.kt", l = {228, 237, 238}, m = "emit")
        public static final class C0254a extends LM {
            public /* synthetic */ Object d;
            public int e;
            public a h;
            public InterfaceC6606sf0 i;
            public Float j;
            public float k;

            public C0254a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0, C3027bp1 c3027bp1, C3443dp c3443dp, I10 i10, C3863fp.a aVar, C4283hp c4283hp) {
            this.e = c3027bp1;
            this.g = c3443dp;
            this.h = aVar;
            this.i = c4283hp;
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
        
            if (r6.a(r14, r0) == r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        
            if (r6.a(r14, r0) == r1) goto L47;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC6606sf0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(T r14, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r15) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3025bp.a.a(java.lang.Object, JM):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3025bp(InterfaceC6396rf0 interfaceC6396rf0, JM jm, C3027bp1 c3027bp1, C3443dp c3443dp, I10 i10, C3863fp.a aVar, C4283hp c4283hp) {
        super(2, jm);
        this.g = interfaceC6396rf0;
        this.h = c3027bp1;
        this.i = c3443dp;
        this.j = i10;
        this.k = aVar;
        this.l = c4283hp;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C3025bp c3025bp = new C3025bp(this.g, jm, this.h, this.i, this.j, this.k, this.l);
        c3025bp.e = obj;
        return c3025bp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super H32.a> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C3025bp) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a((InterfaceC6606sf0) this.e, this.h, this.i, this.j, this.k, this.l);
            this.d = 1;
            if (this.g.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
