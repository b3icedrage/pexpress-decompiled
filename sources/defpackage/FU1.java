package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 92\u00020\u0001:\u0001:BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00105R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002060\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"LFU1;", "Leu0;", "Lav0;", "_subscriptionBackend", "Lws0;", "_deviceService", "LWr0;", "_applicationService", "LBU1;", "_subscriptionModelStore", "LxI;", "_configModelStore", "Lzu0;", "_buildUserService", "Lx41;", "_newRecordState", "Lls0;", "_consistencyManager", "<init>", "(Lav0;Lws0;LWr0;LBU1;LxI;Lzu0;Lx41;Lls0;)V", "LPP;", "createOperation", "", "LQ91;", "operations", "LT90;", "createSubscription", "(LPP;Ljava/util/List;LJM;)Ljava/lang/Object;", "LX92;", "startingOperation", "updateSubscription", "(LX92;Ljava/util/List;LJM;)Ljava/lang/Object;", "Lq42;", "transferSubscription", "(Lq42;LJM;)Ljava/lang/Object;", "LHU1;", "subscriptionType", "LEU1;", "convert", "(LHU1;)LEU1;", "LkX;", "op", "deleteSubscription", "(LkX;LJM;)Ljava/lang/Object;", "execute", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "Lav0;", "Lws0;", "LWr0;", "LBU1;", "LxI;", "Lzu0;", "Lx41;", "Lls0;", "", "getOperations", "()Ljava/util/List;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FU1 implements InterfaceC3669eu0 {

    @NotNull
    public static final String CREATE_SUBSCRIPTION = "create-subscription";

    @NotNull
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";

    @NotNull
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";

    @NotNull
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC8130zu0 _buildUserService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC5181ls0 _consistencyManager;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final C7536x41 _newRecordState;

    @NotNull
    private final InterfaceC2834av0 _subscriptionBackend;

    @NotNull
    private final BU1 _subscriptionModelStore;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[C5013l41.a.values().length];
            iArr[C5013l41.a.RETRYABLE.ordinal()] = 1;
            iArr[C5013l41.a.CONFLICT.ordinal()] = 2;
            iArr[C5013l41.a.INVALID.ordinal()] = 3;
            iArr[C5013l41.a.UNAUTHORIZED.ordinal()] = 4;
            iArr[C5013l41.a.MISSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HU1.values().length];
            iArr2[HU1.SMS.ordinal()] = 1;
            iArr2[HU1.EMAIL.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", l = {109, 120, 122}, m = "createSubscription")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FU1.this.createSubscription(null, null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", l = {277}, m = "deleteSubscription")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FU1.this.deleteSubscription(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", l = {241}, m = "transferSubscription")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        int label;
        /* synthetic */ Object result;

        public e(JM<? super e> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FU1.this.transferSubscription(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", l = {191, 194, 196}, m = "updateSubscription")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FU1.this.updateSubscription(null, null, this);
        }
    }

    public FU1(@NotNull InterfaceC2834av0 _subscriptionBackend, @NotNull InterfaceC7494ws0 _deviceService, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull BU1 _subscriptionModelStore, @NotNull C7582xI _configModelStore, @NotNull InterfaceC8130zu0 _buildUserService, @NotNull C7536x41 _newRecordState, @NotNull InterfaceC5181ls0 _consistencyManager) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._subscriptionBackend = _subscriptionBackend;
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
    }

    private final EU1 convert(HU1 subscriptionType) {
        int i = b.$EnumSwitchMapping$1[subscriptionType.ordinal()];
        if (i != 1) {
            return i != 2 ? EU1.INSTANCE.fromDeviceType(this._deviceService.getDeviceType()) : EU1.EMAIL;
        }
        return EU1.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:118:0x0299  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158 A[Catch: up -> 0x0169, TryCatch #0 {up -> 0x0169, blocks: (B:66:0x0154, B:68:0x0158, B:72:0x016c, B:74:0x0176, B:79:0x0191), top: B:120:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016c A[Catch: up -> 0x0169, TryCatch #0 {up -> 0x0169, blocks: (B:66:0x0154, B:68:0x0158, B:72:0x016c, B:74:0x0176, B:79:0x0191), top: B:120:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0176 A[Catch: up -> 0x0169, TryCatch #0 {up -> 0x0169, blocks: (B:66:0x0154, B:68:0x0158, B:72:0x016c, B:74:0x0176, B:79:0x0191), top: B:120:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191 A[Catch: up -> 0x0169, TRY_LEAVE, TryCatch #0 {up -> 0x0169, blocks: (B:66:0x0154, B:68:0x0158, B:72:0x016c, B:74:0x0176, B:79:0x0191), top: B:120:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3 A[Catch: up -> 0x0042, TryCatch #3 {up -> 0x0042, blocks: (B:15:0x003d, B:82:0x01a4, B:84:0x01b3, B:85:0x01c0, B:87:0x01d6, B:88:0x01e1), top: B:125:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6 A[Catch: up -> 0x0042, TryCatch #3 {up -> 0x0042, blocks: (B:15:0x003d, B:82:0x01a4, B:84:0x01b3, B:85:0x01c0, B:87:0x01d6, B:88:0x01e1), top: B:125:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        if (r0.resolveConditionsWithID(defpackage.C6243qv0.ID, r9) == r3) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createSubscription(defpackage.PP r27, java.util.List<? extends defpackage.Q91> r28, defpackage.JM<? super defpackage.T90> r29) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FU1.createSubscription(PP, java.util.List, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:41:0x00bc->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object deleteSubscription(C4894kX c4894kX, JM<? super T90> jm) {
        d dVar;
        C7063up c7063up;
        FU1 fu1;
        int i;
        List listF;
        Iterator it;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i3 = dVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            try {
                InterfaceC2834av0 interfaceC2834av0 = this._subscriptionBackend;
                String appId = c4894kX.getAppId();
                String subscriptionId = c4894kX.getSubscriptionId();
                dVar.L$0 = this;
                dVar.L$1 = c4894kX;
                dVar.label = 1;
                if (interfaceC2834av0.deleteSubscription(appId, subscriptionId, dVar) == mn) {
                    return mn;
                }
                fu1 = this;
            } catch (C7063up e2) {
                c7063up = e2;
                fu1 = this;
                i = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(c7063up.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new T90(U90.FAIL_RETRY, null, null, c7063up.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (c7063up.getStatusCode() == 404) {
                    it = listF.iterator();
                    while (it.hasNext()) {
                        if (fu1._newRecordState.isInMissingRetryWindow((String) it.next())) {
                            return new T90(U90.FAIL_RETRY, null, null, c7063up.getRetryAfterSeconds(), 6, null);
                        }
                    }
                }
                return new T90(U90.SUCCESS, null, null, null, 14, null);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4894kX = (C4894kX) dVar.L$1;
            fu1 = (FU1) dVar.L$0;
            try {
                C1795Pt1.b(obj);
            } catch (C7063up e3) {
                c7063up = e3;
                i = b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(c7063up.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new T90(U90.FAIL_RETRY, null, null, c7063up.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (c7063up.getStatusCode() == 404 && ((listF = WE.f(c4894kX.getOnesignalId(), c4894kX.getSubscriptionId())) == null || !listF.isEmpty())) {
                    it = listF.iterator();
                    while (it.hasNext()) {
                        if (fu1._newRecordState.isInMissingRetryWindow((String) it.next())) {
                            return new T90(U90.FAIL_RETRY, null, null, c7063up.getRetryAfterSeconds(), 6, null);
                        }
                    }
                }
                return new T90(U90.SUCCESS, null, null, null, 14, null);
            }
        }
        fu1._subscriptionModelStore.remove(c4894kX.getSubscriptionId(), "HYDRATE");
        return new T90(U90.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object transferSubscription(C6067q42 c6067q42, JM<? super T90> jm) {
        e eVar;
        if (jm instanceof e) {
            eVar = (e) jm;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(jm);
            }
        } else {
            eVar = new e(jm);
        }
        e eVar2 = eVar;
        Object obj = eVar2.result;
        MN mn = MN.d;
        int i2 = eVar2.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                InterfaceC2834av0 interfaceC2834av0 = this._subscriptionBackend;
                String appId = c6067q42.getAppId();
                String subscriptionId = c6067q42.getSubscriptionId();
                String onesignalId = c6067q42.getOnesignalId();
                eVar2.label = 1;
                if (interfaceC2834av0.transferSubscription(appId, subscriptionId, "onesignal_id", onesignalId, eVar2) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            i3 = 0;
            return new T90(U90.SUCCESS, null, null, null, 14, null);
        } catch (C7063up e2) {
            return b.$EnumSwitchMapping$0[C5013l41.INSTANCE.getResponseStatusType(e2.getStatusCode()).ordinal()] == i3 ? new T90(U90.FAIL_RETRY, null, null, e2.getRetryAfterSeconds(), 6, null) : new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee A[Catch: up -> 0x005f, TryCatch #1 {up -> 0x005f, blocks: (B:22:0x005a, B:31:0x00e9, B:33:0x00ee, B:36:0x0105), top: B:67:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105 A[Catch: up -> 0x005f, TRY_LEAVE, TryCatch #1 {up -> 0x005f, blocks: (B:22:0x005a, B:31:0x00e9, B:33:0x00ee, B:36:0x0105), top: B:67:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if (r0.resolveConditionsWithID(defpackage.C6243qv0.ID, r2) == r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSubscription(defpackage.X92 r22, java.util.List<? extends defpackage.Q91> r23, defpackage.JM<? super defpackage.T90> r24) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FU1.updateSubscription(X92, java.util.List, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3669eu0
    @Nullable
    public Object execute(@NotNull List<? extends Q91> list, @NotNull JM<? super T90> jm) throws Exception {
        NS0.log(EnumC5513nS0.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        Q91 q91 = (Q91) CollectionsKt.F(list);
        if (q91 instanceof PP) {
            return createSubscription((PP) q91, list, jm);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Q91) it.next()) instanceof C4894kX) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof C4894kX) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((C4894kX) CollectionsKt.F(arrayList), jm);
                }
            }
        }
        if (q91 instanceof X92) {
            return updateSubscription((X92) q91, list, jm);
        }
        if (!(q91 instanceof C6067q42)) {
            throw new Exception("Unrecognized operation: " + q91);
        }
        if (list.size() <= 1) {
            return transferSubscription((C6067q42) q91, jm);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // defpackage.InterfaceC3669eu0
    @NotNull
    public List<String> getOperations() {
        return WE.f(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
