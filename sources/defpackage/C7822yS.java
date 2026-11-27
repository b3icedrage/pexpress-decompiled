package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
public final class C7822yS extends AW1 implements Function2<Object, JM<Object>, Object> {
    public Iterator d;
    public InterfaceC7191vS e;
    public Object g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ List<InterfaceC7191vS<Object>> j;
    public final /* synthetic */ ArrayList k;

    /* JADX INFO: renamed from: yS$a */
    @InterfaceC3368dU(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ InterfaceC7191vS<Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7191vS<Object> interfaceC7191vS, JM<? super a> jm) {
            super(1, jm);
            this.e = interfaceC7191vS;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (this.e.j() == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7822yS(List list, ArrayList arrayList, JM jm) {
        super(2, jm);
        this.j = list;
        this.k = arrayList;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7822yS c7822yS = new C7822yS(this.j, this.k, jm);
        c7822yS.i = obj;
        return c7822yS;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, JM<Object> jm) {
        return ((C7822yS) create(obj, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            MN r0 = defpackage.MN.d
            int r1 = r9.h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r9.d
            java.lang.Object r4 = r9.i
            java.util.List r4 = (java.util.List) r4
            defpackage.C1795Pt1.b(r10)
            goto L3c
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.g
            vS r4 = r9.e
            java.util.Iterator r5 = r9.d
            java.lang.Object r6 = r9.i
            java.util.List r6 = (java.util.List) r6
            defpackage.C1795Pt1.b(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L5e
        L2f:
            defpackage.C1795Pt1.b(r10)
            java.lang.Object r10 = r9.i
            java.util.List<vS<java.lang.Object>> r1 = r9.j
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r9.k
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r1.next()
            vS r5 = (defpackage.InterfaceC7191vS) r5
            r9.i = r4
            r9.d = r1
            r9.e = r5
            r9.g = r10
            r9.h = r3
            java.lang.Object r6 = r5.k(r9, r10)
            if (r6 != r0) goto L59
            goto L7f
        L59:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L5e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L82
            yS$a r10 = new yS$a
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.i = r4
            r9.d = r5
            r9.e = r7
            r9.g = r7
            r9.h = r2
            java.lang.Object r10 = r6.l(r1, r9)
            if (r10 != r0) goto L80
        L7f:
            return r0
        L80:
            r1 = r5
            goto L3c
        L82:
            r10 = r1
            goto L80
        L84:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7822yS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
