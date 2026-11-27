package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"LU61;", "LgA;", "LNz0;", "dataRepository", "Lgv0;", "timeProvider", "<init>", "(LNz0;Lgv0;)V", "", "id", "Lorg/json/JSONArray;", "getLastChannelObjectsReceivedByNewId", "(Ljava/lang/String;)Lorg/json/JSONArray;", "channelObjects", "", "saveChannelObjects", "(Lorg/json/JSONArray;)V", "initInfluencedTypeFromCache", "()V", "cacheState", "getLastChannelObjects", "()Lorg/json/JSONArray;", "lastChannelObjects", "getIdTag", "()Ljava/lang/String;", "idTag", "LKz0;", "getChannelType", "()LKz0;", "channelType", "", "getChannelLimit", "()I", "channelLimit", "getIndirectAttributionWindow", "indirectAttributionWindow", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class U61 extends AbstractC3937gA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U61(@NotNull C1656Nz0 dataRepository, @NotNull InterfaceC4092gv0 timeProvider) {
        super(dataRepository, timeProvider);
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
    }

    @Override // defpackage.AbstractC3937gA, defpackage.InterfaceC4293hs0
    public void cacheState() {
        C1656Nz0 dataRepository = getDataRepository();
        EnumC1890Qz0 influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = EnumC1890Qz0.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // defpackage.AbstractC3937gA
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // defpackage.AbstractC3937gA, defpackage.InterfaceC4293hs0
    @NotNull
    public EnumC1420Kz0 getChannelType() {
        return EnumC1420Kz0.NOTIFICATION;
    }

    @Override // defpackage.AbstractC3937gA, defpackage.InterfaceC4293hs0
    @NotNull
    public String getIdTag() {
        return C1575Mz0.NOTIFICATION_ID_TAG;
    }

    @Override // defpackage.AbstractC3937gA
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // defpackage.AbstractC3937gA
    @NotNull
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // defpackage.AbstractC3937gA
    @NotNull
    public JSONArray getLastChannelObjectsReceivedByNewId(@Nullable String id) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e) {
            NS0.error("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    @Override // defpackage.AbstractC3937gA
    public void initInfluencedTypeFromCache() {
        EnumC1890Qz0 notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        NS0.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // defpackage.AbstractC3937gA
    public void saveChannelObjects(@NotNull JSONArray channelObjects) {
        Intrinsics.checkNotNullParameter(channelObjects, "channelObjects");
        getDataRepository().saveNotifications(channelObjects);
    }
}
