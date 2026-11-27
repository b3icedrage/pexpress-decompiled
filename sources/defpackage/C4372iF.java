package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4372iF {

    /* JADX INFO: renamed from: iF$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public InterfaceC1733Oz d;
        public byte[] e;
        public int g;
        public int h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ InterfaceC6396rf0<Object>[] k;
        public final /* synthetic */ ML0 l;
        public final /* synthetic */ AW1 m;
        public final /* synthetic */ InterfaceC6606sf0<Object> n;

        /* JADX INFO: renamed from: iF$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class C0373a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ InterfaceC6396rf0<Object>[] e;
            public final /* synthetic */ int g;
            public final /* synthetic */ AtomicInteger h;
            public final /* synthetic */ C2030Su i;

            /* JADX INFO: renamed from: iF$a$a$a, reason: collision with other inner class name */
            public static final class C0374a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ C2030Su d;
                public final /* synthetic */ int e;

                /* JADX INFO: renamed from: iF$a$a$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                public static final class C0375a extends LM {
                    public /* synthetic */ Object d;
                    public final /* synthetic */ C0374a<T> e;
                    public int g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0375a(C0374a<? super T> c0374a, JM<? super C0375a> jm) {
                        super(jm);
                        this.e = c0374a;
                    }

                    @Override // defpackage.AbstractC7487wq
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.d = obj;
                        this.g |= Integer.MIN_VALUE;
                        return this.e.a(null, this);
                    }
                }

                public C0374a(C2030Su c2030Su, int i) {
                    this.d = c2030Su;
                    this.e = i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
                
                    if (defpackage.C8056za.z(r0) == r1) goto L21;
                 */
                @Override // defpackage.InterfaceC6606sf0
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(T r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof defpackage.C4372iF.a.C0373a.C0374a.C0375a
                        if (r0 == 0) goto L13
                        r0 = r7
                        iF$a$a$a$a r0 = (defpackage.C4372iF.a.C0373a.C0374a.C0375a) r0
                        int r1 = r0.g
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.g = r1
                        goto L18
                    L13:
                        iF$a$a$a$a r0 = new iF$a$a$a$a
                        r0.<init>(r5, r7)
                    L18:
                        java.lang.Object r7 = r0.d
                        MN r1 = defpackage.MN.d
                        int r2 = r0.g
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L36
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        defpackage.C1795Pt1.b(r7)
                        goto L54
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        defpackage.C1795Pt1.b(r7)
                        goto L4b
                    L36:
                        defpackage.C1795Pt1.b(r7)
                        kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
                        int r2 = r5.e
                        r7.<init>(r2, r6)
                        r0.g = r4
                        Su r6 = r5.d
                        java.lang.Object r6 = r6.j(r0, r7)
                        if (r6 != r1) goto L4b
                        goto L53
                    L4b:
                        r0.g = r3
                        java.lang.Object r6 = defpackage.C8056za.z(r0)
                        if (r6 != r1) goto L54
                    L53:
                        return r1
                    L54:
                        kotlin.Unit r6 = kotlin.Unit.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C4372iF.a.C0373a.C0374a.a(java.lang.Object, JM):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0373a(InterfaceC6396rf0[] interfaceC6396rf0Arr, int i, AtomicInteger atomicInteger, C2030Su c2030Su, JM jm) {
                super(2, jm);
                this.e = interfaceC6396rf0Arr;
                this.g = i;
                this.h = atomicInteger;
                this.i = c2030Su;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new C0373a(this.e, this.g, this.h, this.i, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0373a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MN mn = MN.d;
                int i = this.d;
                AtomicInteger atomicInteger = this.h;
                C2030Su c2030Su = this.i;
                try {
                    if (i == 0) {
                        C1795Pt1.b(obj);
                        InterfaceC6396rf0<Object>[] interfaceC6396rf0Arr = this.e;
                        int i2 = this.g;
                        InterfaceC6396rf0<Object> interfaceC6396rf0 = interfaceC6396rf0Arr[i2];
                        C0374a c0374a = new C0374a(c2030Su, i2);
                        this.d = 1;
                        if (interfaceC6396rf0.c(c0374a, this) == mn) {
                            return mn;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1795Pt1.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        c2030Su.a(null);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        c2030Su.a(null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(JM jm, InterfaceC6606sf0 interfaceC6606sf0, InterfaceC1060Gj0 interfaceC1060Gj0, Function0 function0, InterfaceC6396rf0[] interfaceC6396rf0Arr) {
            super(2, jm);
            this.k = interfaceC6396rf0Arr;
            this.l = (ML0) function0;
            this.m = (AW1) interfaceC1060Gj0;
            this.n = interfaceC6606sf0;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [AW1, Gj0] */
        /* JADX WARN: Type inference failed for: r4v0, types: [ML0, kotlin.jvm.functions.Function0] */
        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            a aVar = new a(jm, this.n, this.m, this.l, this.k);
            aVar.j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00de A[DONT_INVERT, EDGE_INSN: B:42:0x00de->B:20:0x009b BREAK  A[LOOP:0: B:31:0x00bd->B:54:?]] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:48:0x0101  */
        /* JADX WARN: Code duplicated, block: B:53:0x00de A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:31:0x00bd->B:54:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v11, types: [ML0, kotlin.jvm.functions.Function0] */
        /* JADX WARN: Type inference failed for: r14v6, types: [AW1, Gj0] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:20:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0115 -> B:51:0x0118). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x0101
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C4372iF.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Nullable
    public static final Object a(@NotNull JM jm, @NotNull InterfaceC6606sf0 interfaceC6606sf0, @NotNull InterfaceC1060Gj0 interfaceC1060Gj0, @NotNull Function0 function0, @NotNull InterfaceC6396rf0[] interfaceC6396rf0Arr) {
        Object objG = LE.g(new a(null, interfaceC6606sf0, interfaceC1060Gj0, function0, interfaceC6396rf0Arr), jm);
        return objG == MN.d ? objG : Unit.a;
    }
}
