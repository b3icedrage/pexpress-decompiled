package defpackage;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010*J!\u0010/\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u000f2\u0006\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010*J\u0017\u00102\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u0010*J\u0017\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00132\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u001f\u0010:\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u0002030D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"LzU1;", "Lcv0;", "Lvt0;", "LAU1;", "LPu0;", "LWr0;", "_applicationService", "LRu0;", "_sessionService", "LBU1;", "_subscriptionModelStore", "<init>", "(LWr0;LRu0;LBU1;)V", "LHU1;", "type", "", "address", "LGU1;", "status", "", "addSubscriptionToModels", "(LHU1;Ljava/lang/String;LGU1;)V", "LZu0;", "subscription", "removeSubscriptionFromModels", "(LZu0;)V", "subscriptionModel", "createSubscriptionAndAddToSubscriptionList", "(LAU1;)V", "removeSubscriptionFromSubscriptionList", "createSubscriptionFromModel", "(LAU1;)LZu0;", "refreshPushSubscriptionState", "()V", "onSessionStarted", "onSessionActive", "", "duration", "onSessionEnded", "(J)V", "email", "addEmailSubscription", "(Ljava/lang/String;)V", "sms", "addSmsSubscription", "pushToken", "pushTokenStatus", "addOrUpdatePushSubscriptionToken", "(Ljava/lang/String;LGU1;)V", "removeEmailSubscription", "removeSmsSubscription", "Lbv0;", "handler", "subscribe", "(Lbv0;)V", "unsubscribe", "model", "tag", "onModelAdded", "(LAU1;Ljava/lang/String;)V", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "onModelRemoved", "LWr0;", "LRu0;", "LBU1;", "LO80;", "events", "LO80;", "LyU1;", "subscriptions", "LyU1;", "getSubscriptions", "()LyU1;", "setSubscriptions", "(LyU1;)V", "getPushSubscriptionModel", "()LAU1;", "pushSubscriptionModel", "", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C8040zU1 implements InterfaceC3253cv0, InterfaceC7286vt0<AU1>, InterfaceC1797Pu0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC1953Ru0 _sessionService;

    @NotNull
    private final BU1 _subscriptionModelStore;

    @NotNull
    private final O80<InterfaceC3044bv0> events;

    @NotNull
    private C7830yU1 subscriptions;

    /* JADX INFO: renamed from: zU1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HU1.values().length];
            iArr[HU1.SMS.ordinal()] = 1;
            iArr[HU1.EMAIL.ordinal()] = 2;
            iArr[HU1.PUSH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zU1$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbv0;", "it", "", "invoke", "(Lbv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC3044bv0, Unit> {
        final /* synthetic */ InterfaceC2607Zu0 $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2607Zu0 interfaceC2607Zu0) {
            super(1);
            this.$subscription = interfaceC2607Zu0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3044bv0 interfaceC3044bv0) {
            invoke2(interfaceC3044bv0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC3044bv0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionAdded(this.$subscription);
        }
    }

    /* JADX INFO: renamed from: zU1$c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxu0;", "it", "", "invoke", "(Lxu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC7710xu0, Unit> {
        final /* synthetic */ InterfaceC2607Zu0 $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2607Zu0 interfaceC2607Zu0) {
            super(1);
            this.$subscription = interfaceC2607Zu0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7710xu0 interfaceC7710xu0) {
            invoke2(interfaceC7710xu0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC7710xu0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onPushSubscriptionChange(new C5582nl1(((C5372ml1) this.$subscription).getSavedState(), ((C5372ml1) this.$subscription).refreshState()));
        }
    }

    /* JADX INFO: renamed from: zU1$d */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbv0;", "it", "", "invoke", "(Lbv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class d extends ML0 implements Function1<InterfaceC3044bv0, Unit> {
        final /* synthetic */ H01 $args;
        final /* synthetic */ InterfaceC2607Zu0 $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2607Zu0 interfaceC2607Zu0, H01 h01) {
            super(1);
            this.$subscription = interfaceC2607Zu0;
            this.$args = h01;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3044bv0 interfaceC3044bv0) {
            invoke2(interfaceC3044bv0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC3044bv0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    /* JADX INFO: renamed from: zU1$e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbv0;", "it", "", "invoke", "(Lbv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class e extends ML0 implements Function1<InterfaceC3044bv0, Unit> {
        final /* synthetic */ InterfaceC2607Zu0 $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2607Zu0 interfaceC2607Zu0) {
            super(1);
            this.$subscription = interfaceC2607Zu0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3044bv0 interfaceC3044bv0) {
            invoke2(interfaceC3044bv0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC3044bv0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionRemoved(this.$subscription);
        }
    }

    public C8040zU1(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1953Ru0 _sessionService, @NotNull BU1 _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new O80<>();
        this.subscriptions = new C7830yU1(C5653o60.d, new F82());
        Iterator it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((AU1) it.next());
        }
        this._subscriptionModelStore.subscribe((InterfaceC7286vt0) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(HU1 type, String address, GU1 status) {
        NS0.log(EnumC5513nS0.DEBUG, "SubscriptionManager.addSubscription(type: " + type + ", address: " + address + ')');
        AU1 au1 = new AU1();
        au1.setId(C6443rs0.INSTANCE.createLocalId());
        au1.setOptedIn(true);
        au1.setType(type);
        au1.setAddress(address);
        if (status == null) {
            status = GU1.SUBSCRIBED;
        }
        au1.setStatus(status);
        InterfaceC7076ut0.a.add$default(this._subscriptionModelStore, au1, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(C8040zU1 c8040zU1, HU1 hu1, String str, GU1 gu1, int i, Object obj) {
        if ((i & 4) != 0) {
            gu1 = null;
        }
        c8040zU1.addSubscriptionToModels(hu1, str, gu1);
    }

    private final void createSubscriptionAndAddToSubscriptionList(AU1 subscriptionModel) {
        InterfaceC2607Zu0 interfaceC2607Zu0CreateSubscriptionFromModel = createSubscriptionFromModel(subscriptionModel);
        ArrayList arrayListF0 = CollectionsKt.f0(getSubscriptions().getCollection());
        if (subscriptionModel.getType() == HU1.PUSH) {
            InterfaceC7500wu0 push = getSubscriptions().getPush();
            Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            C5372ml1 c5372ml1 = (C5372ml1) push;
            Intrinsics.c(interfaceC2607Zu0CreateSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((C5372ml1) interfaceC2607Zu0CreateSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(c5372ml1.getChangeHandlersNotifier());
            arrayListF0.remove(c5372ml1);
        }
        arrayListF0.add(interfaceC2607Zu0CreateSubscriptionFromModel);
        setSubscriptions(new C7830yU1(arrayListF0, new F82()));
        this.events.fire(new b(interfaceC2607Zu0CreateSubscriptionFromModel));
    }

    private final InterfaceC2607Zu0 createSubscriptionFromModel(AU1 subscriptionModel) {
        int i = a.$EnumSwitchMapping$0[subscriptionModel.getType().ordinal()];
        if (i == 1) {
            return new C4398iN1(subscriptionModel);
        }
        if (i == 2) {
            return new H50(subscriptionModel);
        }
        if (i == 3) {
            return new C5372ml1(subscriptionModel);
        }
        throw new C6489s51();
    }

    private final void refreshPushSubscriptionState() {
        InterfaceC2607Zu0 push = getSubscriptions().getPush();
        if (push instanceof F82) {
            return;
        }
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        AU1 model = ((AbstractC6989uU1) push).getModel();
        model.setSdk(I91.SDK_VERSION);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        model.setDeviceOS(RELEASE);
        String carrierName = C5839p00.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(InterfaceC2607Zu0 subscription) {
        NS0.log(EnumC5513nS0.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + subscription + ')');
        InterfaceC7076ut0.a.remove$default(this._subscriptionModelStore, subscription.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(InterfaceC2607Zu0 subscription) {
        ArrayList arrayListF0 = CollectionsKt.f0(getSubscriptions().getCollection());
        arrayListF0.remove(subscription);
        setSubscriptions(new C7830yU1(arrayListF0, new F82()));
        this.events.fire(new e(subscription));
    }

    @Override // defpackage.InterfaceC3253cv0
    public void addEmailSubscription(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        addSubscriptionToModels$default(this, HU1.EMAIL, email, null, 4, null);
    }

    @Override // defpackage.InterfaceC3253cv0
    public void addOrUpdatePushSubscriptionToken(@Nullable String pushToken, @NotNull GU1 pushTokenStatus) {
        Intrinsics.checkNotNullParameter(pushTokenStatus, "pushTokenStatus");
        InterfaceC2607Zu0 push = getSubscriptions().getPush();
        if (push instanceof F82) {
            HU1 hu1 = HU1.PUSH;
            if (pushToken == null) {
                pushToken = "";
            }
            addSubscriptionToModels(hu1, pushToken, pushTokenStatus);
            return;
        }
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        AU1 model = ((AbstractC6989uU1) push).getModel();
        if (pushToken != null) {
            model.setAddress(pushToken);
        }
        model.setStatus(pushTokenStatus);
    }

    @Override // defpackage.InterfaceC3253cv0
    public void addSmsSubscription(@NotNull String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        addSubscriptionToModels$default(this, HU1.SMS, sms, null, 4, null);
    }

    @Override // defpackage.InterfaceC3253cv0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC3253cv0
    @NotNull
    public AU1 getPushSubscriptionModel() {
        InterfaceC7500wu0 push = getSubscriptions().getPush();
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((C5372ml1) push).getModel();
    }

    @Override // defpackage.InterfaceC3253cv0
    @NotNull
    public C7830yU1 getSubscriptions() {
        return this.subscriptions;
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Object next;
        InterfaceC2607Zu0 interfaceC2607Zu0;
        D01 model;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            interfaceC2607Zu0 = (InterfaceC2607Zu0) next;
            model = args.getModel();
            Intrinsics.c(interfaceC2607Zu0, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        } while (!Intrinsics.a(model, ((AbstractC6989uU1) interfaceC2607Zu0).getModel()));
        InterfaceC2607Zu0 interfaceC2607Zu1 = (InterfaceC2607Zu0) next;
        if (interfaceC2607Zu1 == null) {
            D01 model2 = args.getModel();
            Intrinsics.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((AU1) model2);
        } else {
            if (interfaceC2607Zu1 instanceof C5372ml1) {
                ((C5372ml1) interfaceC2607Zu1).getChangeHandlersNotifier().fireOnMain(new c(interfaceC2607Zu1));
            }
            this.events.fire(new d(interfaceC2607Zu1, args));
        }
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // defpackage.InterfaceC3253cv0
    public void removeEmailSubscription(@NotNull String email) {
        Object next;
        Intrinsics.checkNotNullParameter(email, "email");
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC0619As0 interfaceC0619As0 = (InterfaceC0619As0) next;
            if ((interfaceC0619As0 instanceof H50) && Intrinsics.a(interfaceC0619As0.getEmail(), email)) {
                break;
            }
        }
        InterfaceC0619As0 interfaceC0619As1 = (InterfaceC0619As0) next;
        if (interfaceC0619As1 != null) {
            removeSubscriptionFromModels(interfaceC0619As1);
        }
    }

    @Override // defpackage.InterfaceC3253cv0
    public void removeSmsSubscription(@NotNull String sms) {
        Object next;
        Intrinsics.checkNotNullParameter(sms, "sms");
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC2187Uu0 interfaceC2187Uu0 = (InterfaceC2187Uu0) next;
            if ((interfaceC2187Uu0 instanceof C4398iN1) && Intrinsics.a(interfaceC2187Uu0.getNumber(), sms)) {
                break;
            }
        }
        InterfaceC2187Uu0 interfaceC2187Uu1 = (InterfaceC2187Uu0) next;
        if (interfaceC2187Uu1 != null) {
            removeSubscriptionFromModels(interfaceC2187Uu1);
        }
    }

    @Override // defpackage.InterfaceC3253cv0
    public void setSubscriptions(@NotNull C7830yU1 c7830yU1) {
        Intrinsics.checkNotNullParameter(c7830yU1, "<set-?>");
        this.subscriptions = c7830yU1;
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelAdded(@NotNull AU1 model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelRemoved(@NotNull AU1 model, @NotNull String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (model.getType() == HU1.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((InterfaceC2607Zu0) next).getId(), model.getId()));
        InterfaceC2607Zu0 interfaceC2607Zu0 = (InterfaceC2607Zu0) next;
        if (interfaceC2607Zu0 != null) {
            removeSubscriptionFromSubscriptionList(interfaceC2607Zu0);
        }
    }

    @Override // defpackage.InterfaceC3253cv0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC3044bv0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // defpackage.InterfaceC3253cv0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC3044bv0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.unsubscribe(handler);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionActive() {
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionEnded(long duration) {
    }
}
