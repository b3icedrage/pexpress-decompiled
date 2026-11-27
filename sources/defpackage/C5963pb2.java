package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u001d\u0010\u001e\u001a\u00020\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0012J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0012J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0016J#\u0010)\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0017H\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0012J\u001d\u0010,\u001a\u00020\u00102\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016¢\u0006\u0004\b,\u0010\u001fJ\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0017H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J\u001f\u00106\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u0002082\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020/0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00178F¢\u0006\u0006\u001a\u0004\bQ\u0010.R\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lpb2;", "Lnv0;", "LTu0;", "LSv0;", "Lcv0;", "_subscriptionManager", "LTv0;", "_identityModelStore", "Lqj1;", "_propertiesModelStore", "Let0;", "_languageContext", "<init>", "(Lcv0;LTv0;Lqj1;Let0;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setLanguage", "(Ljava/lang/String;)V", "label", "id", "addAlias", "(Ljava/lang/String;Ljava/lang/String;)V", "", "aliases", "addAliases", "(Ljava/util/Map;)V", "removeAlias", "", "labels", "removeAliases", "(Ljava/util/Collection;)V", "email", "addEmail", "removeEmail", "sms", "addSms", "removeSms", "key", "addTag", "tags", "addTags", "removeTag", "keys", "removeTags", "getTags", "()Ljava/util/Map;", "Lov0;", "observer", "addObserver", "(Lov0;)V", "removeObserver", "model", "tag", "onModelReplaced", "(LSv0;Ljava/lang/String;)V", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "Lcv0;", "LTv0;", "Lqj1;", "Let0;", "LO80;", "changeHandlersNotifier", "LO80;", "getChangeHandlersNotifier", "()LO80;", "get_identityModel", "()LSv0;", "_identityModel", "Lpj1;", "get_propertiesModel", "()Lpj1;", "_propertiesModel", "getOnesignalId", "()Ljava/lang/String;", "onesignalId", "getExternalId", "externalId", "getAliases", "LyU1;", "getSubscriptions", "()LyU1;", "subscriptions", "Lwu0;", "getPushSubscription", "()Lwu0;", "pushSubscription", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C5963pb2 implements InterfaceC5613nv0, InterfaceC2109Tu0<C2034Sv0> {

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final InterfaceC3666et0 _languageContext;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;

    @NotNull
    private final O80<InterfaceC5823ov0> changeHandlersNotifier;

    /* JADX INFO: renamed from: pb2$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov0;", "it", "", "invoke", "(Lov0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC5823ov0, Unit> {
        final /* synthetic */ Pb2 $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Pb2 pb2) {
            super(1);
            this.$newUserState = pb2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5823ov0 interfaceC5823ov0) {
            invoke2(interfaceC5823ov0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5823ov0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onUserStateChange(new Wa2(this.$newUserState));
        }
    }

    public C5963pb2(@NotNull InterfaceC3253cv0 _subscriptionManager, @NotNull C2112Tv0 _identityModelStore, @NotNull C6204qj1 _propertiesModelStore, @NotNull InterfaceC3666et0 _languageContext) {
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._subscriptionManager = _subscriptionManager;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._languageContext = _languageContext;
        this.changeHandlersNotifier = new O80<>();
        _identityModelStore.subscribe((InterfaceC2109Tu0) this);
    }

    private final C2034Sv0 get_identityModel() {
        return this._identityModelStore.getModel();
    }

    private final C5994pj1 get_propertiesModel() {
        return this._propertiesModelStore.getModel();
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addAlias(@NotNull String label, @NotNull String id) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id, "id");
        NS0.log(EnumC5513nS0.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            NS0.log(EnumC5513nS0.ERROR, "Cannot add empty alias");
        } else if (Intrinsics.a(label, "onesignal_id")) {
            NS0.log(EnumC5513nS0.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put(label, id);
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addAliases(@NotNull Map<String, String> aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        NS0.log(EnumC5513nS0.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                NS0.log(EnumC5513nS0.ERROR, "Cannot add empty alias");
                return;
            } else if (Intrinsics.a(entry.getKey(), "onesignal_id")) {
                NS0.log(EnumC5513nS0.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addEmail(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        NS0.log(EnumC5513nS0.DEBUG, "addEmail(email: " + email + ')');
        if (I91.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
            return;
        }
        NS0.log(EnumC5513nS0.ERROR, "Cannot add invalid email address as subscription: " + email);
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addObserver(@NotNull InterfaceC5823ov0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addSms(@NotNull String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        NS0.log(EnumC5513nS0.DEBUG, "addSms(sms: " + sms + ')');
        if (I91.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
            return;
        }
        NS0.log(EnumC5513nS0.ERROR, "Cannot add invalid sms number as subscription: " + sms);
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addTag(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        NS0.log(EnumC5513nS0.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            NS0.log(EnumC5513nS0.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put(key, value);
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void addTags(@NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        NS0.log(EnumC5513nS0.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                NS0.log(EnumC5513nS0.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put(entry.getKey(), entry.getValue());
        }
    }

    @NotNull
    public final Map<String, String> getAliases() {
        C2034Sv0 c2034Sv0 = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c2034Sv0.entrySet()) {
            if (!Intrinsics.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return PW0.k(linkedHashMap);
    }

    @NotNull
    public final O80<InterfaceC5823ov0> getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // defpackage.InterfaceC5613nv0
    @NotNull
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // defpackage.InterfaceC5613nv0
    @NotNull
    public String getOnesignalId() {
        return C6443rs0.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // defpackage.InterfaceC5613nv0
    @NotNull
    public InterfaceC7500wu0 getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    @NotNull
    public final C7830yU1 getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // defpackage.InterfaceC5613nv0
    @NotNull
    public Map<String, String> getTags() {
        return PW0.k(get_propertiesModel().getTags());
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelReplaced(@NotNull C2034Sv0 model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new Pb2(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeAlias(@NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        NS0.log(EnumC5513nS0.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            NS0.log(EnumC5513nS0.ERROR, "Cannot remove empty alias");
        } else if (Intrinsics.a(label, "onesignal_id")) {
            NS0.log(EnumC5513nS0.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeAliases(@NotNull Collection<String> labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        NS0.log(EnumC5513nS0.DEBUG, "removeAliases(labels: " + labels + ')');
        Collection<String> collection = labels;
        for (String str : collection) {
            if (str.length() == 0) {
                NS0.log(EnumC5513nS0.ERROR, "Cannot remove empty alias");
                return;
            } else if (Intrinsics.a(str, "onesignal_id")) {
                NS0.log(EnumC5513nS0.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeEmail(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        NS0.log(EnumC5513nS0.DEBUG, "removeEmail(email: " + email + ')');
        if (I91.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
            return;
        }
        NS0.log(EnumC5513nS0.ERROR, "Cannot remove invalid email address as subscription: " + email);
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeObserver(@NotNull InterfaceC5823ov0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeSms(@NotNull String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        NS0.log(EnumC5513nS0.DEBUG, "removeSms(sms: " + sms + ')');
        if (I91.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
            return;
        }
        NS0.log(EnumC5513nS0.ERROR, "Cannot remove invalid sms number as subscription: " + sms);
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeTag(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        NS0.log(EnumC5513nS0.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            NS0.log(EnumC5513nS0.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void removeTags(@NotNull Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        NS0.log(EnumC5513nS0.DEBUG, "removeTags(keys: " + keys + ')');
        Collection<String> collection = keys;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                NS0.log(EnumC5513nS0.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // defpackage.InterfaceC5613nv0
    public void setLanguage(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._languageContext.setLanguage(value);
    }
}
