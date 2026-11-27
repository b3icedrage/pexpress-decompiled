package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1438Lf0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0<T> d;
    public final /* synthetic */ C3027bp1<Throwable> e;

    /* JADX INFO: renamed from: Lf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    public static final class a extends LM {
        public C1438Lf0 d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C1438Lf0<T> g;
        public int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C1438Lf0<? super T> c1438Lf0, JM<? super a> jm) {
            super(jm);
            this.g = c1438Lf0;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1438Lf0(InterfaceC6606sf0<? super T> interfaceC6606sf0, C3027bp1<Throwable> c3027bp1) {
        this.d = interfaceC6606sf0;
        this.e = c3027bp1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) throws Throwable {
        a aVar;
        C1438Lf0<T> c1438Lf0;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1438Lf0 = aVar.d;
            try {
                C1795Pt1.b(obj);
                return Unit.a;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                this = this;
                boolean r0 = r6 instanceof defpackage.C1438Lf0.a
                if (r0 == 0) goto L13
                r0 = r6
                Lf0$a r0 = (defpackage.C1438Lf0.a) r0
                int r1 = r0.h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.h = r1
                goto L18
            L13:
                Lf0$a r0 = new Lf0$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.e
                MN r1 = defpackage.MN.d
                int r2 = r0.h
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                Lf0 r5 = r0.d
                defpackage.C1795Pt1.b(r6)     // Catch: java.lang.Throwable -> L29
                goto L43
            L29:
                r6 = move-exception
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                defpackage.C1795Pt1.b(r6)
                sf0<T> r6 = r4.d     // Catch: java.lang.Throwable -> L46
                r0.d = r4     // Catch: java.lang.Throwable -> L46
                r0.h = r3     // Catch: java.lang.Throwable -> L46
                java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L46
                if (r5 != r1) goto L43
                return r1
            L43:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L46:
                r6 = move-exception
                r5 = r4
            L48:
                bp1<java.lang.Throwable> r5 = r5.e
                r5.d = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1438Lf0.a(java.lang.Object, JM):java.lang.Object");
        }
    }
