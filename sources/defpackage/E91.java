package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J#\u0010\u0015\u001a\u00020\t\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\t2\u001c\b\u0002\u0010#\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010 H\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\"\u0010)\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010L\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R$\u0010O\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R$\u0010R\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010-R\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006w"}, d2 = {"LE91;", "Ldu0;", "LOu0;", "<init>", "()V", "Landroid/content/Context;", "context", "", "appId", "", "initWithContext", "(Landroid/content/Context;Ljava/lang/String;)Z", "externalId", "jwtBearerToken", "", "login", "(Ljava/lang/String;Ljava/lang/String;)V", "logout", "T", "Ljava/lang/Class;", "c", "hasService", "(Ljava/lang/Class;)Z", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "getServiceOrNull", "", "getAllServices", "(Ljava/lang/Class;)Ljava/util/List;", "getLegacyAppId", "()Ljava/lang/String;", "suppressBackendOperation", "Lkotlin/Function2;", "LSv0;", "Lpj1;", "modify", "createAndSwitchToNewUser", "(ZLkotlin/jvm/functions/Function2;)V", "sdkVersion", "Ljava/lang/String;", "getSdkVersion", "isInitialized", "Z", "()Z", "setInitialized", "(Z)V", "Lvs0;", "debug", "Lvs0;", "getDebug", "()Lvs0;", "Lfu0;", "operationRepo", "Lfu0;", "LtI1;", "services", "LtI1;", "LwI;", "configModel", "LwI;", "LLI1;", "sessionModel", "LLI1;", "_consentRequired", "Ljava/lang/Boolean;", "_consentGiven", "_disableGMSMissingPrompt", "", "initLock", "Ljava/lang/Object;", "loginLock", "listOfModules", "Ljava/util/List;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getConsentRequired", "setConsentRequired", "consentRequired", "getConsentGiven", "setConsentGiven", "consentGiven", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "disableGMSMissingPrompt", "LQu0;", "getSession", "()LQu0;", "session", "Lcu0;", "getNotifications", "()Lcu0;", "notifications", "Lkt0;", "getLocation", "()Lkt0;", "location", "LYs0;", "getInAppMessages", "()LYs0;", "inAppMessages", "Lnv0;", "getUser", "()Lnv0;", "user", "LTv0;", "getIdentityModelStore", "()LTv0;", "identityModelStore", "Lqj1;", "getPropertiesModelStore", "()Lqj1;", "propertiesModelStore", "LBU1;", "getSubscriptionModelStore", "()LBU1;", "subscriptionModelStore", "Lsu0;", "getPreferencesService", "()Lsu0;", "preferencesService", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class E91 implements InterfaceC3459du0, InterfaceC1719Ou0 {

    @Nullable
    private Boolean _consentGiven;

    @Nullable
    private Boolean _consentRequired;

    @Nullable
    private Boolean _disableGMSMissingPrompt;

    @Nullable
    private C7371wI configModel;
    private boolean isInitialized;

    @NotNull
    private final List<String> listOfModules;

    @Nullable
    private InterfaceC3879fu0 operationRepo;

    @NotNull
    private final C6743tI1 services;

    @Nullable
    private LI1 sessionModel;

    @NotNull
    private final String sdkVersion = I91.SDK_VERSION;

    @NotNull
    private final InterfaceC7283vs0 debug = new C3158cU();

    @NotNull
    private final Object initLock = new Object();

    @NotNull
    private final Object loginLock = new Object();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LSv0;", "identityModel", "Lpj1;", "<anonymous parameter 1>", "", "invoke", "(LSv0;Lpj1;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function2<C2034Sv0, C5994pj1, Unit> {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C2034Sv0 c2034Sv0, C5994pj1 c5994pj1) {
            invoke2(c2034Sv0, c5994pj1);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull C2034Sv0 identityModel, @NotNull C5994pj1 c5994pj1) {
            Intrinsics.checkNotNullParameter(identityModel, "identityModel");
            Intrinsics.checkNotNullParameter(c5994pj1, "<anonymous parameter 1>");
            identityModel.setExternalId(this.$externalId);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.internal.OneSignalImp$login$2", f = "OneSignalImp.kt", l = {388}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<String> $currentIdentityExternalId;
        final /* synthetic */ C3027bp1<String> $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ C3027bp1<String> $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3027bp1<String> c3027bp1, String str, C3027bp1<String> c3027bp2, C3027bp1<String> c3027bp3, JM<? super b> jm) {
            super(1, jm);
            this.$newIdentityOneSignalId = c3027bp1;
            this.$externalId = str;
            this.$currentIdentityExternalId = c3027bp2;
            this.$currentIdentityOneSignalId = c3027bp3;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return E91.this.new b(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC3879fu0 interfaceC3879fu0 = E91.this.operationRepo;
                Intrinsics.checkNotNull(interfaceC3879fu0);
                C7371wI c7371wI = E91.this.configModel;
                Intrinsics.checkNotNull(c7371wI);
                C5936pT0 c5936pT0 = new C5936pT0(c7371wI.getAppId(), this.$newIdentityOneSignalId.d, this.$externalId, this.$currentIdentityExternalId.d == null ? this.$currentIdentityOneSignalId.d : null);
                this.label = 1;
                obj = InterfaceC3879fu0.a.enqueueAndWait$default(interfaceC3879fu0, c5936pT0, false, this, 2, null);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                NS0.log(EnumC5513nS0.ERROR, "Could not login user");
            }
            return Unit.a;
        }
    }

    public E91() throws IllegalAccessException, InstantiationException {
        List<String> listF = WE.f("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = listF;
        C5274mI1 c5274mI1 = new C5274mI1();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = listF.iterator();
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).newInstance();
                Intrinsics.c(objNewInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((InterfaceC7497wt0) objNewInstance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC7497wt0) it2.next()).register(c5274mI1);
        }
        this.services = c5274mI1.build();
    }

    private final void createAndSwitchToNewUser(boolean suppressBackendOperation, Function2<? super C2034Sv0, ? super C5994pj1, Unit> modify) {
        Object next;
        String id;
        String address;
        GU1 status;
        String id2;
        C7371wI c7371wI;
        NS0.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String strCreateLocalId = C6443rs0.INSTANCE.createLocalId();
        C2034Sv0 c2034Sv0 = new C2034Sv0();
        c2034Sv0.setOnesignalId(strCreateLocalId);
        C5994pj1 c5994pj1 = new C5994pj1();
        c5994pj1.setOnesignalId(strCreateLocalId);
        if (modify != null) {
            modify.invoke(c2034Sv0, c5994pj1);
        }
        ArrayList arrayList = new ArrayList();
        BU1 subscriptionModelStore = getSubscriptionModelStore();
        Intrinsics.checkNotNull(subscriptionModelStore);
        Iterator it = subscriptionModelStore.list().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            id2 = ((AU1) next).getId();
            c7371wI = this.configModel;
            Intrinsics.checkNotNull(c7371wI);
        } while (!Intrinsics.a(id2, c7371wI.getPushSubscriptionId()));
        AU1 au1 = (AU1) next;
        AU1 au2 = new AU1();
        String strCreateLocalId2 = C6443rs0.INSTANCE.createLocalId();
        if (au1 == null || (id = au1.getId()) == null) {
            id = strCreateLocalId2;
        }
        au2.setId(id);
        au2.setType(HU1.PUSH);
        au2.setOptedIn(au1 != null ? au1.getOptedIn() : true);
        if (au1 == null || (address = au1.getAddress()) == null) {
            address = "";
        }
        au2.setAddress(address);
        if (au1 == null || (status = au1.getStatus()) == null) {
            status = GU1.NO_PERMISSION;
        }
        au2.setStatus(status);
        au2.setSdk(I91.SDK_VERSION);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        au2.setDeviceOS(RELEASE);
        String carrierName = C5839p00.INSTANCE.getCarrierName(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        au2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
        au2.setAppVersion(appVersion != null ? appVersion : "");
        BU1 subscriptionModelStore2 = getSubscriptionModelStore();
        Intrinsics.checkNotNull(subscriptionModelStore2);
        String str = "NO_PROPOGATE";
        subscriptionModelStore2.clear("NO_PROPOGATE");
        C2112Tv0 identityModelStore = getIdentityModelStore();
        Intrinsics.checkNotNull(identityModelStore);
        InterfaceC2031Su0.a.replace$default(identityModelStore, c2034Sv0, null, 2, null);
        C6204qj1 propertiesModelStore = getPropertiesModelStore();
        Intrinsics.checkNotNull(propertiesModelStore);
        InterfaceC2031Su0.a.replace$default(propertiesModelStore, c5994pj1, null, 2, null);
        if (!suppressBackendOperation) {
            if ((au1 != null ? au1.getId() : null) == null || c2034Sv0.getExternalId() == null) {
                au2.setId(strCreateLocalId2);
                str = "NORMAL";
            } else {
                InterfaceC3879fu0 interfaceC3879fu0 = this.operationRepo;
                Intrinsics.checkNotNull(interfaceC3879fu0);
                C7371wI c7371wI2 = this.configModel;
                Intrinsics.checkNotNull(c7371wI2);
                InterfaceC3879fu0.a.enqueue$default(interfaceC3879fu0, new C6067q42(c7371wI2.getAppId(), au1.getId(), strCreateLocalId), false, 2, null);
            }
        }
        C7371wI c7371wI3 = this.configModel;
        Intrinsics.checkNotNull(c7371wI3);
        c7371wI3.setPushSubscriptionId(au2.getId());
        arrayList.add(au2);
        BU1 subscriptionModelStore3 = getSubscriptionModelStore();
        Intrinsics.checkNotNull(subscriptionModelStore3);
        subscriptionModelStore3.replaceAll(arrayList, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createAndSwitchToNewUser$default(E91 e91, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        e91.createAndSwitchToNewUser(z, function2);
    }

    private final C2112Tv0 getIdentityModelStore() {
        return (C2112Tv0) this.services.getService(C2112Tv0.class);
    }

    private final String getLegacyAppId() {
        return InterfaceC6659su0.a.getString$default(getPreferencesService(), "OneSignal", "GT_APP_ID", null, 4, null);
    }

    private final InterfaceC6659su0 getPreferencesService() {
        return (InterfaceC6659su0) this.services.getService(InterfaceC6659su0.class);
    }

    private final C6204qj1 getPropertiesModelStore() {
        return (C6204qj1) this.services.getService(C6204qj1.class);
    }

    private final BU1 getSubscriptionModelStore() {
        return (BU1) this.services.getService(BU1.class);
    }

    @Override // defpackage.InterfaceC1719Ou0
    @NotNull
    public <T> List<T> getAllServices(@NotNull Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.services.getAllServices(c);
    }

    public boolean getConsentGiven() {
        Boolean consentGiven;
        C7371wI c7371wI = this.configModel;
        return (c7371wI == null || (consentGiven = c7371wI.getConsentGiven()) == null) ? Intrinsics.a(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    public boolean getConsentRequired() {
        Boolean consentRequired;
        C7371wI c7371wI = this.configModel;
        return (c7371wI == null || (consentRequired = c7371wI.getConsentRequired()) == null) ? Intrinsics.a(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    @Override // defpackage.InterfaceC3459du0
    @NotNull
    public InterfaceC7283vs0 getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        C7371wI c7371wI = this.configModel;
        return c7371wI != null ? c7371wI.getDisableGMSMissingPrompt() : Intrinsics.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC3459du0
    @NotNull
    public InterfaceC2523Ys0 getInAppMessages() throws Exception {
        if (getIsInitialized()) {
            return (InterfaceC2523Ys0) this.services.getService(InterfaceC2523Ys0.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @NotNull
    public InterfaceC4974kt0 getLocation() throws Exception {
        if (getIsInitialized()) {
            return (InterfaceC4974kt0) this.services.getService(InterfaceC4974kt0.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // defpackage.InterfaceC3459du0
    @NotNull
    public InterfaceC3250cu0 getNotifications() throws Exception {
        if (getIsInitialized()) {
            return (InterfaceC3250cu0) this.services.getService(InterfaceC3250cu0.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @NotNull
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // defpackage.InterfaceC1719Ou0
    public <T> T getService(@NotNull Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) this.services.getService(c);
    }

    @Override // defpackage.InterfaceC1719Ou0
    @Nullable
    public <T> T getServiceOrNull(@NotNull Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) this.services.getServiceOrNull(c);
    }

    @NotNull
    public InterfaceC1875Qu0 getSession() throws Exception {
        if (getIsInitialized()) {
            return (InterfaceC1875Qu0) this.services.getService(InterfaceC1875Qu0.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // defpackage.InterfaceC3459du0
    @NotNull
    public InterfaceC5613nv0 getUser() throws Exception {
        if (getIsInitialized()) {
            return (InterfaceC5613nv0) this.services.getService(InterfaceC5613nv0.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // defpackage.InterfaceC1719Ou0
    public <T> boolean hasService(@NotNull Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.services.hasService(c);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0180 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x009e, B:15:0x00ab, B:17:0x00b1, B:20:0x00b8, B:23:0x00cc, B:25:0x00d9, B:28:0x00e9, B:29:0x00f1, B:31:0x00f5, B:32:0x0102, B:34:0x0106, B:35:0x0113, B:37:0x0117, B:38:0x0128, B:40:0x0134, B:43:0x014a, B:81:0x02d9, B:44:0x016c, B:46:0x0180, B:47:0x01c8, B:49:0x01e3, B:54:0x020a, B:61:0x021c, B:64:0x0229, B:66:0x022e, B:70:0x023c, B:72:0x0245, B:75:0x026c, B:78:0x0287, B:80:0x02a1, B:71:0x0240, B:57:0x0213, B:52:0x0204), top: B:86:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01c8 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x009e, B:15:0x00ab, B:17:0x00b1, B:20:0x00b8, B:23:0x00cc, B:25:0x00d9, B:28:0x00e9, B:29:0x00f1, B:31:0x00f5, B:32:0x0102, B:34:0x0106, B:35:0x0113, B:37:0x0117, B:38:0x0128, B:40:0x0134, B:43:0x014a, B:81:0x02d9, B:44:0x016c, B:46:0x0180, B:47:0x01c8, B:49:0x01e3, B:54:0x020a, B:61:0x021c, B:64:0x0229, B:66:0x022e, B:70:0x023c, B:72:0x0245, B:75:0x026c, B:78:0x0287, B:80:0x02a1, B:71:0x0240, B:57:0x0213, B:52:0x0204), top: B:86:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01e3 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x009e, B:15:0x00ab, B:17:0x00b1, B:20:0x00b8, B:23:0x00cc, B:25:0x00d9, B:28:0x00e9, B:29:0x00f1, B:31:0x00f5, B:32:0x0102, B:34:0x0106, B:35:0x0113, B:37:0x0117, B:38:0x0128, B:40:0x0134, B:43:0x014a, B:81:0x02d9, B:44:0x016c, B:46:0x0180, B:47:0x01c8, B:49:0x01e3, B:54:0x020a, B:61:0x021c, B:64:0x0229, B:66:0x022e, B:70:0x023c, B:72:0x0245, B:75:0x026c, B:78:0x0287, B:80:0x02a1, B:71:0x0240, B:57:0x0213, B:52:0x0204), top: B:86:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x021b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0227  */
    /* JADX WARN: Code duplicated, block: B:66:0x022e A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x009e, B:15:0x00ab, B:17:0x00b1, B:20:0x00b8, B:23:0x00cc, B:25:0x00d9, B:28:0x00e9, B:29:0x00f1, B:31:0x00f5, B:32:0x0102, B:34:0x0106, B:35:0x0113, B:37:0x0117, B:38:0x0128, B:40:0x0134, B:43:0x014a, B:81:0x02d9, B:44:0x016c, B:46:0x0180, B:47:0x01c8, B:49:0x01e3, B:54:0x020a, B:61:0x021c, B:64:0x0229, B:66:0x022e, B:70:0x023c, B:72:0x0245, B:75:0x026c, B:78:0x0287, B:80:0x02a1, B:71:0x0240, B:57:0x0213, B:52:0x0204), top: B:86:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x023a  */
    /* JADX WARN: Code duplicated, block: B:69:0x023b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0240 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x009e, B:15:0x00ab, B:17:0x00b1, B:20:0x00b8, B:23:0x00cc, B:25:0x00d9, B:28:0x00e9, B:29:0x00f1, B:31:0x00f5, B:32:0x0102, B:34:0x0106, B:35:0x0113, B:37:0x0117, B:38:0x0128, B:40:0x0134, B:43:0x014a, B:81:0x02d9, B:44:0x016c, B:46:0x0180, B:47:0x01c8, B:49:0x01e3, B:54:0x020a, B:61:0x021c, B:64:0x0229, B:66:0x022e, B:70:0x023c, B:72:0x0245, B:75:0x026c, B:78:0x0287, B:80:0x02a1, B:71:0x0240, B:57:0x0213, B:52:0x0204), top: B:86:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x026a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0285  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a0  */
    @Override // defpackage.InterfaceC3459du0
    public boolean initWithContext(@NotNull Context context, @Nullable String appId) {
        boolean z;
        String string$default;
        String string$default2;
        boolean z2;
        Integer numSafeInt;
        AU1 au1;
        GU1 gu1;
        boolean z3;
        String strSafeString;
        String carrierName;
        String appVersion;
        GU1 gu1FromInt;
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC5513nS0 enumC5513nS0 = EnumC5513nS0.DEBUG;
        NS0.log(enumC5513nS0, "initWithContext(context: " + context + ", appId: " + appId + ')');
        synchronized (this.initLock) {
            if (getIsInitialized()) {
                NS0.log(enumC5513nS0, "initWithContext: SDK already initialized");
                return true;
            }
            NS0.log(enumC5513nS0, "initWithContext: SDK initializing");
            C7662xg1.INSTANCE.ensureNoObfuscatedPrefStore(context);
            InterfaceC2338Wr0 interfaceC2338Wr0 = (InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class);
            Intrinsics.c(interfaceC2338Wr0, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((ViewTreeObserverOnGlobalLayoutListenerC1368Ki) interfaceC2338Wr0).start(context);
            NS0.INSTANCE.setApplicationService(interfaceC2338Wr0);
            this.configModel = ((C7582xI) this.services.getService(C7582xI.class)).getModel();
            this.sessionModel = ((MI1) this.services.getService(MI1.class)).getModel();
            this.operationRepo = (InterfaceC3879fu0) this.services.getService(InterfaceC3879fu0.class);
            if (appId == null) {
                C7371wI c7371wI = this.configModel;
                Intrinsics.checkNotNull(c7371wI);
                if (c7371wI.hasProperty("appId")) {
                    z = false;
                } else {
                    String legacyAppId = getLegacyAppId();
                    if (legacyAppId == null) {
                        NS0.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                        return false;
                    }
                    NS0.debug$default("initWithContext: using cached legacy appId ".concat(legacyAppId), null, 2, null);
                    C7371wI c7371wI2 = this.configModel;
                    Intrinsics.checkNotNull(c7371wI2);
                    c7371wI2.setAppId(legacyAppId);
                    z = true;
                }
            } else {
                z = false;
            }
            if (appId != null) {
                C7371wI c7371wI3 = this.configModel;
                Intrinsics.checkNotNull(c7371wI3);
                if (c7371wI3.hasProperty("appId")) {
                    C7371wI c7371wI4 = this.configModel;
                    Intrinsics.checkNotNull(c7371wI4);
                    if (!Intrinsics.a(c7371wI4.getAppId(), appId)) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                C7371wI c7371wI5 = this.configModel;
                Intrinsics.checkNotNull(c7371wI5);
                c7371wI5.setAppId(appId);
            }
            if (this._consentRequired != null) {
                C7371wI c7371wI6 = this.configModel;
                Intrinsics.checkNotNull(c7371wI6);
                Boolean bool = this._consentRequired;
                Intrinsics.checkNotNull(bool);
                c7371wI6.setConsentRequired(bool);
            }
            if (this._consentGiven != null) {
                C7371wI c7371wI7 = this.configModel;
                Intrinsics.checkNotNull(c7371wI7);
                Boolean bool2 = this._consentGiven;
                Intrinsics.checkNotNull(bool2);
                c7371wI7.setConsentGiven(bool2);
            }
            if (this._disableGMSMissingPrompt != null) {
                C7371wI c7371wI8 = this.configModel;
                Intrinsics.checkNotNull(c7371wI8);
                Boolean bool3 = this._disableGMSMissingPrompt;
                Intrinsics.checkNotNull(bool3);
                c7371wI8.setDisableGMSMissingPrompt(bool3.booleanValue());
            }
            C8025zP1 c8025zP1 = new C8025zP1(this.services);
            c8025zP1.bootstrap();
            if (z) {
                InterfaceC6659su0 preferencesService = getPreferencesService();
                Intrinsics.checkNotNull(preferencesService);
                string$default = InterfaceC6659su0.a.getString$default(preferencesService, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                if (string$default == null) {
                    NS0.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                    createAndSwitchToNewUser$default(this, false, null, 3, null);
                    InterfaceC3879fu0 interfaceC3879fu0 = this.operationRepo;
                    Intrinsics.checkNotNull(interfaceC3879fu0);
                    C7371wI c7371wI9 = this.configModel;
                    Intrinsics.checkNotNull(c7371wI9);
                    String appId2 = c7371wI9.getAppId();
                    C2112Tv0 identityModelStore = getIdentityModelStore();
                    Intrinsics.checkNotNull(identityModelStore);
                    String onesignalId = identityModelStore.getModel().getOnesignalId();
                    C2112Tv0 identityModelStore2 = getIdentityModelStore();
                    Intrinsics.checkNotNull(identityModelStore2);
                    InterfaceC3879fu0.a.enqueue$default(interfaceC3879fu0, new C5936pT0(appId2, onesignalId, identityModelStore2.getModel().getExternalId(), null, 8, null), false, 2, null);
                } else {
                    NS0.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                    InterfaceC6659su0 preferencesService2 = getPreferencesService();
                    Intrinsics.checkNotNull(preferencesService2);
                    string$default2 = InterfaceC6659su0.a.getString$default(preferencesService2, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                    if (string$default2 != null) {
                        JSONObject jSONObject = new JSONObject(string$default2);
                        numSafeInt = JD0.safeInt(jSONObject, "notification_types");
                        au1 = new AU1();
                        au1.setId(string$default);
                        au1.setType(HU1.PUSH);
                        gu1 = GU1.NO_PERMISSION;
                        int value = gu1.getValue();
                        if (numSafeInt != null) {
                            z3 = false;
                            au1.setOptedIn(z3);
                            strSafeString = JD0.safeString(jSONObject, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            au1.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                gu1FromInt = GU1.INSTANCE.fromInt(numSafeInt.intValue());
                                if (gu1FromInt == null) {
                                    gu1 = gu1FromInt;
                                }
                                au1.setStatus(gu1);
                            } else {
                                au1.setStatus(GU1.SUBSCRIBED);
                            }
                            au1.setSdk(I91.SDK_VERSION);
                            String RELEASE = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                            au1.setDeviceOS(RELEASE);
                            carrierName = C5839p00.INSTANCE.getCarrierName(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            au1.setCarrier(carrierName);
                            appVersion = AndroidUtils.INSTANCE.getAppVersion(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            au1.setAppVersion(appVersion);
                            C7371wI c7371wI10 = this.configModel;
                            Intrinsics.checkNotNull(c7371wI10);
                            c7371wI10.setPushSubscriptionId(string$default);
                            BU1 subscriptionModelStore = getSubscriptionModelStore();
                            Intrinsics.checkNotNull(subscriptionModelStore);
                            subscriptionModelStore.add(au1, "NO_PROPOGATE");
                            z2 = true;
                        }
                        int value2 = GU1.UNSUBSCRIBE.getValue();
                        if (numSafeInt != null) {
                            z3 = false;
                            au1.setOptedIn(z3);
                            strSafeString = JD0.safeString(jSONObject, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            au1.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                gu1FromInt = GU1.INSTANCE.fromInt(numSafeInt.intValue());
                                if (gu1FromInt == null) {
                                    gu1 = gu1FromInt;
                                }
                                au1.setStatus(gu1);
                            } else {
                                au1.setStatus(GU1.SUBSCRIBED);
                            }
                            au1.setSdk(I91.SDK_VERSION);
                            String RELEASE2 = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                            au1.setDeviceOS(RELEASE2);
                            carrierName = C5839p00.INSTANCE.getCarrierName(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            au1.setCarrier(carrierName);
                            appVersion = AndroidUtils.INSTANCE.getAppVersion(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            au1.setAppVersion(appVersion);
                            C7371wI c7371wI11 = this.configModel;
                            Intrinsics.checkNotNull(c7371wI11);
                            c7371wI11.setPushSubscriptionId(string$default);
                            BU1 subscriptionModelStore2 = getSubscriptionModelStore();
                            Intrinsics.checkNotNull(subscriptionModelStore2);
                            subscriptionModelStore2.add(au1, "NO_PROPOGATE");
                            z2 = true;
                        }
                        z3 = true;
                        au1.setOptedIn(z3);
                        strSafeString = JD0.safeString(jSONObject, "identifier");
                        if (strSafeString == null) {
                            strSafeString = "";
                        }
                        au1.setAddress(strSafeString);
                        if (numSafeInt != null) {
                            gu1FromInt = GU1.INSTANCE.fromInt(numSafeInt.intValue());
                            if (gu1FromInt == null) {
                                gu1 = gu1FromInt;
                            }
                            au1.setStatus(gu1);
                        } else {
                            au1.setStatus(GU1.SUBSCRIBED);
                        }
                        au1.setSdk(I91.SDK_VERSION);
                        String RELEASE3 = Build.VERSION.RELEASE;
                        Intrinsics.checkNotNullExpressionValue(RELEASE3, "RELEASE");
                        au1.setDeviceOS(RELEASE3);
                        carrierName = C5839p00.INSTANCE.getCarrierName(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                        if (carrierName == null) {
                            carrierName = "";
                        }
                        au1.setCarrier(carrierName);
                        appVersion = AndroidUtils.INSTANCE.getAppVersion(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                        if (appVersion == null) {
                            appVersion = "";
                        }
                        au1.setAppVersion(appVersion);
                        C7371wI c7371wI12 = this.configModel;
                        Intrinsics.checkNotNull(c7371wI12);
                        c7371wI12.setPushSubscriptionId(string$default);
                        BU1 subscriptionModelStore3 = getSubscriptionModelStore();
                        Intrinsics.checkNotNull(subscriptionModelStore3);
                        subscriptionModelStore3.add(au1, "NO_PROPOGATE");
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    createAndSwitchToNewUser$default(this, z2, null, 2, null);
                    InterfaceC3879fu0 interfaceC3879fu1 = this.operationRepo;
                    Intrinsics.checkNotNull(interfaceC3879fu1);
                    C7371wI c7371wI13 = this.configModel;
                    Intrinsics.checkNotNull(c7371wI13);
                    String appId3 = c7371wI13.getAppId();
                    C2112Tv0 identityModelStore3 = getIdentityModelStore();
                    Intrinsics.checkNotNull(identityModelStore3);
                    InterfaceC3879fu0.a.enqueue$default(interfaceC3879fu1, new C5516nT0(appId3, identityModelStore3.getModel().getOnesignalId(), string$default), false, 2, null);
                    InterfaceC6659su0 preferencesService3 = getPreferencesService();
                    Intrinsics.checkNotNull(preferencesService3);
                    preferencesService3.saveString("OneSignal", "GT_PLAYER_ID", null);
                }
            } else {
                C2112Tv0 identityModelStore4 = getIdentityModelStore();
                Intrinsics.checkNotNull(identityModelStore4);
                if (identityModelStore4.getModel().hasProperty("onesignal_id")) {
                    StringBuilder sb = new StringBuilder("initWithContext: using cached user ");
                    C2112Tv0 identityModelStore5 = getIdentityModelStore();
                    Intrinsics.checkNotNull(identityModelStore5);
                    sb.append(identityModelStore5.getModel().getOnesignalId());
                    NS0.debug$default(sb.toString(), null, 2, null);
                } else {
                    InterfaceC6659su0 preferencesService4 = getPreferencesService();
                    Intrinsics.checkNotNull(preferencesService4);
                    string$default = InterfaceC6659su0.a.getString$default(preferencesService4, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                    if (string$default == null) {
                        NS0.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                        createAndSwitchToNewUser$default(this, false, null, 3, null);
                        InterfaceC3879fu0 interfaceC3879fu2 = this.operationRepo;
                        Intrinsics.checkNotNull(interfaceC3879fu2);
                        C7371wI c7371wI14 = this.configModel;
                        Intrinsics.checkNotNull(c7371wI14);
                        String appId4 = c7371wI14.getAppId();
                        C2112Tv0 identityModelStore6 = getIdentityModelStore();
                        Intrinsics.checkNotNull(identityModelStore6);
                        String onesignalId2 = identityModelStore6.getModel().getOnesignalId();
                        C2112Tv0 identityModelStore7 = getIdentityModelStore();
                        Intrinsics.checkNotNull(identityModelStore7);
                        InterfaceC3879fu0.a.enqueue$default(interfaceC3879fu2, new C5936pT0(appId4, onesignalId2, identityModelStore7.getModel().getExternalId(), null, 8, null), false, 2, null);
                    } else {
                        NS0.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                        InterfaceC6659su0 preferencesService5 = getPreferencesService();
                        Intrinsics.checkNotNull(preferencesService5);
                        string$default2 = InterfaceC6659su0.a.getString$default(preferencesService5, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                        if (string$default2 != null) {
                            JSONObject jSONObject2 = new JSONObject(string$default2);
                            numSafeInt = JD0.safeInt(jSONObject2, "notification_types");
                            au1 = new AU1();
                            au1.setId(string$default);
                            au1.setType(HU1.PUSH);
                            gu1 = GU1.NO_PERMISSION;
                            int value3 = gu1.getValue();
                            if (numSafeInt != null && numSafeInt.intValue() == value3) {
                                z3 = false;
                            } else {
                                int value4 = GU1.UNSUBSCRIBE.getValue();
                                if (numSafeInt != null && numSafeInt.intValue() == value4) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            }
                            au1.setOptedIn(z3);
                            strSafeString = JD0.safeString(jSONObject2, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            au1.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                gu1FromInt = GU1.INSTANCE.fromInt(numSafeInt.intValue());
                                if (gu1FromInt == null) {
                                    gu1 = gu1FromInt;
                                }
                                au1.setStatus(gu1);
                            } else {
                                au1.setStatus(GU1.SUBSCRIBED);
                            }
                            au1.setSdk(I91.SDK_VERSION);
                            String RELEASE4 = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE4, "RELEASE");
                            au1.setDeviceOS(RELEASE4);
                            carrierName = C5839p00.INSTANCE.getCarrierName(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            au1.setCarrier(carrierName);
                            appVersion = AndroidUtils.INSTANCE.getAppVersion(((InterfaceC2338Wr0) this.services.getService(InterfaceC2338Wr0.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            au1.setAppVersion(appVersion);
                            C7371wI c7371wI15 = this.configModel;
                            Intrinsics.checkNotNull(c7371wI15);
                            c7371wI15.setPushSubscriptionId(string$default);
                            BU1 subscriptionModelStore4 = getSubscriptionModelStore();
                            Intrinsics.checkNotNull(subscriptionModelStore4);
                            subscriptionModelStore4.add(au1, "NO_PROPOGATE");
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        createAndSwitchToNewUser$default(this, z2, null, 2, null);
                        InterfaceC3879fu0 interfaceC3879fu3 = this.operationRepo;
                        Intrinsics.checkNotNull(interfaceC3879fu3);
                        C7371wI c7371wI16 = this.configModel;
                        Intrinsics.checkNotNull(c7371wI16);
                        String appId5 = c7371wI16.getAppId();
                        C2112Tv0 identityModelStore8 = getIdentityModelStore();
                        Intrinsics.checkNotNull(identityModelStore8);
                        InterfaceC3879fu0.a.enqueue$default(interfaceC3879fu3, new C5516nT0(appId5, identityModelStore8.getModel().getOnesignalId(), string$default), false, 2, null);
                        InterfaceC6659su0 preferencesService6 = getPreferencesService();
                        Intrinsics.checkNotNull(preferencesService6);
                        preferencesService6.saveString("OneSignal", "GT_PLAYER_ID", null);
                    }
                }
            }
            c8025zP1.scheduleStart();
            setInitialized(true);
            return true;
        }
    }

    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public boolean getIsInitialized() {
        return this.isInitialized;
    }

    @Override // defpackage.InterfaceC3459du0
    public void login(@NotNull String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        login(externalId, null);
    }

    public void logout() throws Exception {
        NS0.log(EnumC5513nS0.DEBUG, "logout()");
        if (!getIsInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            C2112Tv0 identityModelStore = getIdentityModelStore();
            Intrinsics.checkNotNull(identityModelStore);
            if (identityModelStore.getModel().getExternalId() == null) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, null, 3, null);
            InterfaceC3879fu0 interfaceC3879fu0 = this.operationRepo;
            Intrinsics.checkNotNull(interfaceC3879fu0);
            C7371wI c7371wI = this.configModel;
            Intrinsics.checkNotNull(c7371wI);
            String appId = c7371wI.getAppId();
            C2112Tv0 identityModelStore2 = getIdentityModelStore();
            Intrinsics.checkNotNull(identityModelStore2);
            String onesignalId = identityModelStore2.getModel().getOnesignalId();
            C2112Tv0 identityModelStore3 = getIdentityModelStore();
            Intrinsics.checkNotNull(identityModelStore3);
            InterfaceC3879fu0.a.enqueue$default(interfaceC3879fu0, new C5936pT0(appId, onesignalId, identityModelStore3.getModel().getExternalId(), null, 8, null), false, 2, null);
            Unit unit = Unit.a;
        }
    }

    public void setConsentGiven(boolean z) {
        InterfaceC3879fu0 interfaceC3879fu0;
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z);
        C7371wI c7371wI = this.configModel;
        if (c7371wI != null) {
            c7371wI.setConsentGiven(Boolean.valueOf(z));
        }
        if (Intrinsics.a(bool, Boolean.valueOf(z)) || !z || (interfaceC3879fu0 = this.operationRepo) == null) {
            return;
        }
        interfaceC3879fu0.forceExecuteOperations();
    }

    public void setConsentRequired(boolean z) {
        this._consentRequired = Boolean.valueOf(z);
        C7371wI c7371wI = this.configModel;
        if (c7371wI == null) {
            return;
        }
        c7371wI.setConsentRequired(Boolean.valueOf(z));
    }

    public void setDisableGMSMissingPrompt(boolean z) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z);
        C7371wI c7371wI = this.configModel;
        if (c7371wI == null) {
            return;
        }
        c7371wI.setDisableGMSMissingPrompt(z);
    }

    public void setInitialized(boolean z) {
        this.isInitialized = z;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    @Override // defpackage.InterfaceC3459du0
    public void login(@NotNull String externalId, @Nullable String jwtBearerToken) throws Exception {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        NS0.log(EnumC5513nS0.DEBUG, "login(externalId: " + externalId + ", jwtBearerToken: " + jwtBearerToken + ')');
        if (getIsInitialized()) {
            C3027bp1 c3027bp1 = new C3027bp1();
            C3027bp1 c3027bp2 = new C3027bp1();
            C3027bp1 c3027bp3 = new C3027bp1();
            c3027bp3.d = "";
            synchronized (this.loginLock) {
                C2112Tv0 identityModelStore = getIdentityModelStore();
                Intrinsics.checkNotNull(identityModelStore);
                c3027bp1.d = identityModelStore.getModel().getExternalId();
                C2112Tv0 identityModelStore2 = getIdentityModelStore();
                Intrinsics.checkNotNull(identityModelStore2);
                c3027bp2.d = identityModelStore2.getModel().getOnesignalId();
                if (Intrinsics.a(c3027bp1.d, externalId)) {
                    return;
                }
                createAndSwitchToNewUser$default(this, false, new a(externalId), 1, null);
                C2112Tv0 identityModelStore3 = getIdentityModelStore();
                Intrinsics.checkNotNull(identityModelStore3);
                c3027bp3.d = identityModelStore3.getModel().getOnesignalId();
                Unit unit = Unit.a;
                LY1.suspendifyOnThread$default(0, new b(c3027bp3, externalId, c3027bp1, c3027bp2, null), 1, null);
                return;
            }
        }
        throw new Exception("Must call 'initWithContext' before 'login'");
    }
}
