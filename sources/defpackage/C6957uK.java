package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R,\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"LuK;", "Lls0;", "<init>", "()V", "", "checkConditionsAndComplete", "", "id", "Lks0;", "key", "LGB1;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setRywData", "(Ljava/lang/String;Lks0;LGB1;LJM;)Ljava/lang/Object;", "Lis0;", "condition", "LCG;", "getRywDataFromAwaitableCondition", "(Lis0;LJM;)Ljava/lang/Object;", "resolveConditionsWithID", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "Lh21;", "mutex", "Lh21;", "", "indexedTokens", "Ljava/util/Map;", "", "Lkotlin/Pair;", "conditions", "Ljava/util/List;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6957uK implements InterfaceC5181ls0 {

    @NotNull
    private final InterfaceC4117h21 mutex = ED.c();

    @NotNull
    private final Map<String, Map<InterfaceC4971ks0, GB1>> indexedTokens = new LinkedHashMap();

    @NotNull
    private final List<Pair<InterfaceC4542is0, CG<GB1>>> conditions = new ArrayList();

    /* JADX INFO: renamed from: uK$a */
    @InterfaceC3368dU(c = "com.onesignal.common.consistency.impl.ConsistencyManager", f = "ConsistencyManager.kt", l = {100}, m = "getRywDataFromAwaitableCondition")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6957uK.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    /* JADX INFO: renamed from: uK$b */
    @InterfaceC3368dU(c = "com.onesignal.common.consistency.impl.ConsistencyManager", f = "ConsistencyManager.kt", l = {100}, m = "setRywData")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6957uK.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (Pair<InterfaceC4542is0, CG<GB1>> pair : this.conditions) {
            InterfaceC4542is0 interfaceC4542is0 = pair.d;
            CG<GB1> cg = pair.e;
            if (interfaceC4542is0.isMet(this.indexedTokens)) {
                GB1 rywData = interfaceC4542is0.getRywData(this.indexedTokens);
                if (!cg.S0()) {
                    cg.L0(rywData);
                }
                arrayList.add(new Pair(interfaceC4542is0, cg));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC5181ls0
    @Nullable
    public Object getRywDataFromAwaitableCondition(@NotNull InterfaceC4542is0 interfaceC4542is0, @NotNull JM<? super CG<GB1>> jm) {
        a aVar;
        InterfaceC4117h21 interfaceC4117h21;
        C6957uK c6957uK;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.result;
        MN mn = MN.d;
        int i2 = aVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            interfaceC4117h21 = this.mutex;
            aVar.L$0 = this;
            aVar.L$1 = interfaceC4542is0;
            aVar.L$2 = interfaceC4117h21;
            aVar.label = 1;
            if (interfaceC4117h21.a(aVar) == mn) {
                return mn;
            }
            c6957uK = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC4117h21 interfaceC4117h22 = (InterfaceC4117h21) aVar.L$2;
            InterfaceC4542is0 interfaceC4542is1 = (InterfaceC4542is0) aVar.L$1;
            c6957uK = (C6957uK) aVar.L$0;
            C1795Pt1.b(obj);
            interfaceC4117h21 = interfaceC4117h22;
            interfaceC4542is0 = interfaceC4542is1;
        }
        try {
            DG dgE = C6561sS.e();
            c6957uK.conditions.add(new Pair<>(interfaceC4542is0, dgE));
            c6957uK.checkConditionsAndComplete();
            return dgE;
        } finally {
            interfaceC4117h21.b(null);
        }
    }

    @Override // defpackage.InterfaceC5181ls0
    @Nullable
    public Object resolveConditionsWithID(@NotNull String str, @NotNull JM<? super Unit> jm) {
        ArrayList arrayList = new ArrayList();
        for (Pair<InterfaceC4542is0, CG<GB1>> pair : this.conditions) {
            InterfaceC4542is0 interfaceC4542is0 = pair.d;
            CG<GB1> cg = pair.e;
            if (Intrinsics.a(interfaceC4542is0.getId(), str) && !cg.S0()) {
                cg.L0(null);
            }
            arrayList.add(new Pair(interfaceC4542is0, cg));
        }
        this.conditions.removeAll(arrayList);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC5181ls0
    @Nullable
    public Object setRywData(@NotNull String str, @NotNull InterfaceC4971ks0 interfaceC4971ks0, @NotNull GB1 gb1, @NotNull JM<? super Unit> jm) {
        b bVar;
        InterfaceC4117h21 interfaceC4117h21;
        C6957uK c6957uK;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object obj = bVar.result;
        MN mn = MN.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            interfaceC4117h21 = this.mutex;
            bVar.L$0 = this;
            bVar.L$1 = str;
            bVar.L$2 = interfaceC4971ks0;
            bVar.L$3 = gb1;
            bVar.L$4 = interfaceC4117h21;
            bVar.label = 1;
            if (interfaceC4117h21.a(bVar) == mn) {
                return mn;
            }
            c6957uK = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC4117h21 interfaceC4117h22 = (InterfaceC4117h21) bVar.L$4;
            gb1 = (GB1) bVar.L$3;
            interfaceC4971ks0 = (InterfaceC4971ks0) bVar.L$2;
            String str2 = (String) bVar.L$1;
            c6957uK = (C6957uK) bVar.L$0;
            C1795Pt1.b(obj);
            interfaceC4117h21 = interfaceC4117h22;
            str = str2;
        }
        try {
            Map<String, Map<InterfaceC4971ks0, GB1>> map = c6957uK.indexedTokens;
            Map<InterfaceC4971ks0, GB1> linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            linkedHashMap.put(interfaceC4971ks0, gb1);
            c6957uK.checkConditionsAndComplete();
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            interfaceC4117h21.b(null);
        }
    }
}
