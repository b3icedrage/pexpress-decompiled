package defpackage;

import android.os.Build;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001<BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ7\u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010!\u001a\u00020 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\b&\u0010'J7\u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010!\u001a\u00020(2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\b&\u0010)J7\u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010!\u001a\u00020*2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\b&\u0010+J7\u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010!\u001a\u00020,2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\b&\u0010-J!\u0010.\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020#0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"LqT0;", "Leu0;", "LVv0;", "_identityOperationExecutor", "LWr0;", "_application", "Lws0;", "_deviceService", "Lmv0;", "_userBackend", "LTv0;", "_identityModelStore", "Lqj1;", "_propertiesModelStore", "LBU1;", "_subscriptionsModelStore", "LxI;", "_configModelStore", "Let0;", "_languageContext", "<init>", "(LVv0;LWr0;Lws0;Lmv0;LTv0;Lqj1;LBU1;LxI;Let0;)V", "LpT0;", "loginUserOp", "", "LQ91;", "operations", "LT90;", "loginUser", "(LpT0;Ljava/util/List;LJM;)Ljava/lang/Object;", "createUserOperation", "createUser", "Lq42;", "operation", "", "", "LDU1;", "subscriptions", "createSubscriptionsFromOperation", "(Lq42;Ljava/util/Map;)Ljava/util/Map;", "LPP;", "(LPP;Ljava/util/Map;)Ljava/util/Map;", "LX92;", "(LX92;Ljava/util/Map;)Ljava/util/Map;", "LkX;", "(LkX;Ljava/util/Map;)Ljava/util/Map;", "execute", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "LVv0;", "LWr0;", "Lws0;", "Lmv0;", "LTv0;", "Lqj1;", "LBU1;", "LxI;", "Let0;", "getOperations", "()Ljava/util/List;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6146qT0 implements InterfaceC3669eu0 {

    @NotNull
    public static final String LOGIN_USER = "login-user";

    @NotNull
    private final InterfaceC2338Wr0 _application;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final C2268Vv0 _identityOperationExecutor;

    @NotNull
    private final InterfaceC3666et0 _languageContext;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final BU1 _subscriptionsModelStore;

    @NotNull
    private final InterfaceC5403mv0 _userBackend;

    /* JADX INFO: renamed from: qT0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[U90.values().length];
            iArr[U90.SUCCESS.ordinal()] = 1;
            iArr[U90.FAIL_CONFLICT.ordinal()] = 2;
            iArr[U90.FAIL_NORETRY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C5013l41.a.values().length];
            iArr2[C5013l41.a.RETRYABLE.ordinal()] = 1;
            iArr2[C5013l41.a.UNAUTHORIZED.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HU1.values().length];
            iArr3[HU1.SMS.ordinal()] = 1;
            iArr3[HU1.EMAIL.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: renamed from: qT0$c */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor", f = "LoginUserOperationExecutor.kt", l = {170}, m = "createUser")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return C6146qT0.this.createUser(null, null, this);
        }
    }

    /* JADX INFO: renamed from: qT0$d */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor", f = "LoginUserOperationExecutor.kt", l = {80, ModuleDescriptor.MODULE_VERSION, 127, 134}, m = "loginUser")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return C6146qT0.this.loginUser(null, null, this);
        }
    }

    public C6146qT0(@NotNull C2268Vv0 _identityOperationExecutor, @NotNull InterfaceC2338Wr0 _application, @NotNull InterfaceC7494ws0 _deviceService, @NotNull InterfaceC5403mv0 _userBackend, @NotNull C2112Tv0 _identityModelStore, @NotNull C6204qj1 _propertiesModelStore, @NotNull BU1 _subscriptionsModelStore, @NotNull C7582xI _configModelStore, @NotNull InterfaceC3666et0 _languageContext) {
        Intrinsics.checkNotNullParameter(_identityOperationExecutor, "_identityOperationExecutor");
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._identityOperationExecutor = _identityOperationExecutor;
        this._application = _application;
        this._deviceService = _deviceService;
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
    }

    private final Map<String, DU1> createSubscriptionsFromOperation(C6067q42 operation, Map<String, DU1> subscriptions) {
        LinkedHashMap linkedHashMapL = PW0.l(subscriptions);
        if (!linkedHashMapL.containsKey(operation.getSubscriptionId())) {
            linkedHashMapL.put(operation.getSubscriptionId(), new DU1(operation.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return linkedHashMapL;
        }
        String subscriptionId = operation.getSubscriptionId();
        String subscriptionId2 = operation.getSubscriptionId();
        DU1 du1 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du1);
        EU1 type = du1.getType();
        DU1 du2 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du2);
        String token = du2.getToken();
        DU1 du3 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du3);
        Boolean enabled = du3.getEnabled();
        DU1 du4 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du4);
        Integer notificationTypes = du4.getNotificationTypes();
        DU1 du5 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du5);
        String sdk = du5.getSdk();
        DU1 du6 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du6);
        String deviceModel = du6.getDeviceModel();
        DU1 du7 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du7);
        String deviceOS = du7.getDeviceOS();
        DU1 du8 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du8);
        Boolean rooted = du8.getRooted();
        DU1 du9 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du9);
        Integer netType = du9.getNetType();
        DU1 du10 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du10);
        String carrier = du10.getCarrier();
        DU1 du11 = subscriptions.get(operation.getSubscriptionId());
        Intrinsics.checkNotNull(du11);
        linkedHashMapL.put(subscriptionId, new DU1(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, du11.getAppVersion()));
        return linkedHashMapL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object createUser(C5936pT0 c5936pT0, List<? extends Q91> list, JM<? super T90> jm) throws Exception {
        c cVar;
        List list2;
        Map<String, String> map;
        C5936pT0 c5936pT1;
        C6146qT0 c6146qT0;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        MN mn = MN.d;
        int i2 = cVar2.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                Map<String, String> mapC = PW0.c();
                Map<String, DU1> mapC2 = PW0.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String timeZoneId = C8055zZ1.INSTANCE.getTimeZoneId();
                Intrinsics.checkNotNull(timeZoneId);
                linkedHashMap.put("timezone_id", timeZoneId);
                linkedHashMap.put("language", this._languageContext.getLanguage());
                if (c5936pT0.getExternalId() != null) {
                    mapC = PW0.l(mapC);
                    String externalId = c5936pT0.getExternalId();
                    Intrinsics.checkNotNull(externalId);
                    mapC.put("external_id", externalId);
                }
                Map<String, String> map2 = mapC;
                for (Q91 q91 : list) {
                    if (q91 instanceof PP) {
                        mapC2 = createSubscriptionsFromOperation((PP) q91, mapC2);
                    } else if (q91 instanceof C6067q42) {
                        mapC2 = createSubscriptionsFromOperation((C6067q42) q91, mapC2);
                    } else if (q91 instanceof X92) {
                        mapC2 = createSubscriptionsFromOperation((X92) q91, mapC2);
                    } else {
                        if (!(q91 instanceof C4894kX)) {
                            throw new Exception("Unrecognized operation: " + q91);
                        }
                        mapC2 = createSubscriptionsFromOperation((C4894kX) q91, mapC2);
                    }
                }
                List listM = RW0.m(mapC2);
                InterfaceC5403mv0 interfaceC5403mv0 = this._userBackend;
                String appId = c5936pT0.getAppId();
                ArrayList arrayList = new ArrayList(XE.m(listM, 10));
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    arrayList.add((DU1) ((Pair) it.next()).e);
                }
                cVar2.L$0 = this;
                cVar2.L$1 = c5936pT0;
                cVar2.L$2 = map2;
                cVar2.L$3 = listM;
                cVar2.label = 1;
                Object objCreateUser = interfaceC5403mv0.createUser(appId, map2, arrayList, linkedHashMap, cVar2);
                if (objCreateUser == mn) {
                    return mn;
                }
                list2 = listM;
                obj = objCreateUser;
                map = map2;
                c5936pT1 = c5936pT0;
                c6146qT0 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) cVar2.L$3;
                map = (Map) cVar2.L$2;
                c5936pT1 = (C5936pT0) cVar2.L$1;
                c6146qT0 = (C6146qT0) cVar2.L$0;
                C1795Pt1.b(obj);
            }
            QP qp = (QP) obj;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str = qp.getIdentities().get("onesignal_id");
            Intrinsics.checkNotNull(str);
            String str2 = str;
            linkedHashMap2.put(c5936pT1.getOnesignalId(), str2);
            C2034Sv0 model = c6146qT0._identityModelStore.getModel();
            C5994pj1 model2 = c6146qT0._propertiesModelStore.getModel();
            if (Intrinsics.a(model.getOnesignalId(), c5936pT1.getOnesignalId())) {
                D01.setStringProperty$default(model, "onesignal_id", str2, "HYDRATE", false, 8, null);
            }
            if (Intrinsics.a(model2.getOnesignalId(), c5936pT1.getOnesignalId())) {
                D01.setStringProperty$default(model2, "onesignalId", str2, "HYDRATE", false, 8, null);
            }
            int size = list2.size();
            for (int i3 = 0; i3 < size && i3 < qp.getSubscriptions().size(); i3++) {
                DU1 du1 = qp.getSubscriptions().get(i3);
                Object obj2 = ((Pair) list2.get(i3)).d;
                String id = du1.getId();
                Intrinsics.checkNotNull(id);
                linkedHashMap2.put(obj2, id);
                if (Intrinsics.a(c6146qT0._configModelStore.getModel().getPushSubscriptionId(), ((Pair) list2.get(i3)).d)) {
                    c6146qT0._configModelStore.getModel().setPushSubscriptionId(du1.getId());
                }
                AU1 au1 = (AU1) c6146qT0._subscriptionsModelStore.get((String) ((Pair) list2.get(i3)).d);
                if (au1 != null) {
                    D01.setStringProperty$default(au1, "id", du1.getId(), "HYDRATE", false, 8, null);
                }
            }
            return new T90(U90.SUCCESS, linkedHashMap2, !map.isEmpty() ? VE.c(new C3658eq1(c5936pT1.getAppId(), str2)) : null, null, 8, null);
        } catch (C7063up e) {
            int i4 = b.$EnumSwitchMapping$1[C5013l41.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i4 != 1) {
                return i4 != 2 ? new T90(U90.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new T90(U90.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            return new T90(U90.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object loginUser(C5936pT0 c5936pT0, List<? extends Q91> list, JM<? super T90> jm) throws Exception {
        d dVar;
        C6146qT0 c6146qT0;
        String str;
        C5936pT0 c5936pT1 = c5936pT0;
        List<? extends Q91> list2 = list;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object objExecute = dVar.result;
        MN mn = MN.d;
        int i2 = dVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objExecute);
            if (list2 == null || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Q91 q91 = (Q91) it.next();
                        if ((q91 instanceof PP) || (q91 instanceof C6067q42)) {
                        }
                    } else if (c5936pT1.getExternalId() == null) {
                        return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
                    }
                }
            } else if (c5936pT1.getExternalId() == null) {
                return new T90(U90.FAIL_NORETRY, null, null, null, 14, null);
            }
            if (c5936pT1.getExistingOnesignalId() == null || c5936pT1.getExternalId() == null) {
                dVar.label = 1;
                Object objCreateUser = createUser(c5936pT1, list2, dVar);
                if (objCreateUser != mn) {
                    return objCreateUser;
                }
            } else {
                C2268Vv0 c2268Vv0 = this._identityOperationExecutor;
                String appId = c5936pT1.getAppId();
                String existingOnesignalId = c5936pT1.getExistingOnesignalId();
                Intrinsics.checkNotNull(existingOnesignalId);
                String externalId = c5936pT1.getExternalId();
                Intrinsics.checkNotNull(externalId);
                List<? extends Q91> listC = VE.c(new C3127cJ1(appId, existingOnesignalId, "external_id", externalId));
                dVar.L$0 = this;
                dVar.L$1 = c5936pT1;
                dVar.L$2 = list2;
                dVar.label = 2;
                objExecute = c2268Vv0.execute(listC, dVar);
                if (objExecute != mn) {
                    c6146qT0 = this;
                }
            }
            return mn;
        }
        if (i2 == 1) {
            C1795Pt1.b(objExecute);
            return objExecute;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                C1795Pt1.b(objExecute);
                return objExecute;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objExecute);
            return objExecute;
        }
        List<? extends Q91> list3 = (List) dVar.L$2;
        C5936pT0 c5936pT2 = (C5936pT0) dVar.L$1;
        c6146qT0 = (C6146qT0) dVar.L$0;
        C1795Pt1.b(objExecute);
        list2 = list3;
        c5936pT1 = c5936pT2;
        T90 t90 = (T90) objExecute;
        int i3 = b.$EnumSwitchMapping$0[t90.getResult().ordinal()];
        if (i3 == 1) {
            String existingOnesignalId2 = c5936pT1.getExistingOnesignalId();
            Intrinsics.checkNotNull(existingOnesignalId2);
            if (Intrinsics.a(c6146qT0._identityModelStore.getModel().getOnesignalId(), c5936pT1.getOnesignalId())) {
                str = existingOnesignalId2;
                D01.setStringProperty$default(c6146qT0._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
            } else {
                str = existingOnesignalId2;
            }
            if (Intrinsics.a(c6146qT0._propertiesModelStore.getModel().getOnesignalId(), c5936pT1.getOnesignalId())) {
                String str2 = str;
                D01.setStringProperty$default(c6146qT0._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                str = str2;
            }
            return new T90(U90.SUCCESS_STARTING_ONLY, OW0.b(new Pair(c5936pT1.getOnesignalId(), str)), null, null, 12, null);
        }
        if (i3 == 2) {
            NS0.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + c5936pT1.getExternalId() + '\"', null, 2, null);
            dVar.L$0 = null;
            dVar.L$1 = null;
            dVar.L$2 = null;
            dVar.label = 3;
            Object objCreateUser2 = c6146qT0.createUser(c5936pT1, list2, dVar);
            if (objCreateUser2 != mn) {
                return objCreateUser2;
            }
        } else {
            if (i3 != 3) {
                return new T90(t90.getResult(), null, null, null, 14, null);
            }
            NS0.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + c5936pT1.getExternalId() + '\"', null, 2, null);
            dVar.L$0 = null;
            dVar.L$1 = null;
            dVar.L$2 = null;
            dVar.label = 4;
            Object objCreateUser3 = c6146qT0.createUser(c5936pT1, list2, dVar);
            if (objCreateUser3 != mn) {
                return objCreateUser3;
            }
        }
        return mn;
    }

    @Override // defpackage.InterfaceC3669eu0
    @Nullable
    public Object execute(@NotNull List<? extends Q91> list, @NotNull JM<? super T90> jm) throws Exception {
        NS0.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        Q91 q91 = (Q91) CollectionsKt.F(list);
        if (q91 instanceof C5936pT0) {
            return loginUser((C5936pT0) q91, CollectionsKt.A(list, 1), jm);
        }
        throw new Exception("Unrecognized operation: " + q91);
    }

    @Override // defpackage.InterfaceC3669eu0
    @NotNull
    public List<String> getOperations() {
        return VE.c(LOGIN_USER);
    }

    private final Map<String, DU1> createSubscriptionsFromOperation(PP operation, Map<String, DU1> subscriptions) {
        EU1 eu1FromDeviceType;
        LinkedHashMap linkedHashMapL = PW0.l(subscriptions);
        int i = b.$EnumSwitchMapping$2[operation.getType().ordinal()];
        if (i == 1) {
            eu1FromDeviceType = EU1.SMS;
        } else if (i != 2) {
            eu1FromDeviceType = EU1.INSTANCE.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            eu1FromDeviceType = EU1.EMAIL;
        }
        EU1 eu1 = eu1FromDeviceType;
        String subscriptionId = operation.getSubscriptionId();
        String address = operation.getAddress();
        Boolean boolValueOf = Boolean.valueOf(operation.getEnabled());
        Integer numValueOf = Integer.valueOf(operation.getStatus().getValue());
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean boolValueOf2 = Boolean.valueOf(VA1.INSTANCE.isRooted());
        C5839p00 c5839p00 = C5839p00.INSTANCE;
        linkedHashMapL.put(subscriptionId, new DU1(null, eu1, address, boolValueOf, numValueOf, I91.SDK_VERSION, str, str2, boolValueOf2, c5839p00.getNetType(this._application.getAppContext()), c5839p00.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return linkedHashMapL;
    }

    private final Map<String, DU1> createSubscriptionsFromOperation(X92 operation, Map<String, DU1> subscriptions) {
        LinkedHashMap linkedHashMapL = PW0.l(subscriptions);
        if (linkedHashMapL.containsKey(operation.getSubscriptionId())) {
            String subscriptionId = operation.getSubscriptionId();
            DU1 du1 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du1);
            String id = du1.getId();
            DU1 du2 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du2);
            EU1 type = du2.getType();
            String address = operation.getAddress();
            Boolean boolValueOf = Boolean.valueOf(operation.getEnabled());
            Integer numValueOf = Integer.valueOf(operation.getStatus().getValue());
            DU1 du3 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du3);
            String sdk = du3.getSdk();
            DU1 du4 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du4);
            String deviceModel = du4.getDeviceModel();
            DU1 du5 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du5);
            String deviceOS = du5.getDeviceOS();
            DU1 du6 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du6);
            Boolean rooted = du6.getRooted();
            DU1 du7 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du7);
            Integer netType = du7.getNetType();
            DU1 du8 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du8);
            String carrier = du8.getCarrier();
            DU1 du9 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(du9);
            linkedHashMapL.put(subscriptionId, new DU1(id, type, address, boolValueOf, numValueOf, sdk, deviceModel, deviceOS, rooted, netType, carrier, du9.getAppVersion()));
        }
        return linkedHashMapL;
    }

    private final Map<String, DU1> createSubscriptionsFromOperation(C4894kX operation, Map<String, DU1> subscriptions) {
        LinkedHashMap linkedHashMapL = PW0.l(subscriptions);
        linkedHashMapL.remove(operation.getSubscriptionId());
        return linkedHashMapL;
    }
}
