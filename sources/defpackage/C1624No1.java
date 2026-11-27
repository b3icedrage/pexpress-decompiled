package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: No1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LNo1;", "Lj01;", "LxI;", "_configModelStore", "LBU1;", "_subscriptionModelStore", "<init>", "(LxI;LBU1;)V", "", "isInBadState", "()Z", "", "recover", "()V", "", "recoveryMessage", "()Ljava/lang/String;", "LxI;", "LBU1;", "LAU1;", "activePushSubscription$delegate", "LfO0;", "getActivePushSubscription", "()LAU1;", "activePushSubscription", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1624No1 extends AbstractC4577j01 {

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final BU1 _subscriptionModelStore;

    /* JADX INFO: renamed from: activePushSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 activePushSubscription;

    /* JADX INFO: renamed from: No1$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LAU1;", "invoke", "()LAU1;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function0<AU1> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final AU1 invoke() {
            Object next;
            Iterator it = C1624No1.this._subscriptionModelStore.list().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((AU1) next).getType() == HU1.PUSH) {
                    return (AU1) next;
                }
            }
            next = null;
            return (AU1) next;
        }
    }

    public C1624No1(@NotNull C7582xI _configModelStore, @NotNull BU1 _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription = XO0.b(new a());
    }

    @Nullable
    public final AU1 getActivePushSubscription() {
        return (AU1) this.activePushSubscription.getValue();
    }

    @Override // defpackage.AbstractC4577j01, defpackage.InterfaceC6656st0
    public boolean isInBadState() {
        return this._configModelStore.getModel().getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // defpackage.AbstractC4577j01, defpackage.InterfaceC6656st0
    public void recover() {
        C7371wI model = this._configModelStore.getModel();
        AU1 activePushSubscription = getActivePushSubscription();
        model.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // defpackage.AbstractC4577j01, defpackage.InterfaceC6656st0
    @NotNull
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
