package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: Oz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J3\u0010$\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b$\u0010#J#\u0010&\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0004\b4\u00101J\u0017\u00105\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0004\b5\u00101J\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010G¨\u0006L"}, d2 = {"LOz0;", "Lct0;", "LPu0;", "LRu0;", "_sessionService", "LWr0;", "_applicationService", "LxI;", "_configModelStore", "Lsu0;", "preferences", "Lgv0;", "timeProvider", "<init>", "(LRu0;LWr0;LxI;Lsu0;Lgv0;)V", "LEg;", "entryAction", "Lhs0;", "getChannelByEntryAction", "(LEg;)Lhs0;", "", "getChannelsToResetByEntryAction", "(LEg;)Ljava/util/List;", "", "restartSessionTrackersIfNeeded", "(LEg;)V", "channelTracker", "LQz0;", "influenceType", "", "directNotificationId", "Lorg/json/JSONArray;", "indirectNotificationIds", "", "setSessionTracker", "(Lhs0;LQz0;Ljava/lang/String;Lorg/json/JSONArray;)Z", "willChangeSessionTracker", "directId", "attemptSessionUpgrade", "(LEg;Ljava/lang/String;)V", "onSessionStarted", "()V", "onSessionActive", "", "duration", "onSessionEnded", "(J)V", "notificationId", "onNotificationReceived", "(Ljava/lang/String;)V", "onDirectInfluenceFromNotification", "messageId", "onInAppMessageDisplayed", "onDirectInfluenceFromIAM", "onInAppMessageDismissed", "LRu0;", "LWr0;", "LxI;", "Ljava/util/concurrent/ConcurrentHashMap;", "LgA;", "trackers", "Ljava/util/concurrent/ConcurrentHashMap;", "LNz0;", "dataRepository", "LNz0;", "getIAMChannelTracker", "()Lhs0;", "iAMChannelTracker", "getNotificationChannelTracker", "notificationChannelTracker", "getChannels", "()Ljava/util/List;", "channels", "LJz0;", "getInfluences", "influences", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1734Oz0 implements InterfaceC3247ct0, InterfaceC1797Pu0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC1953Ru0 _sessionService;

    @NotNull
    private final C1656Nz0 dataRepository;

    @NotNull
    private final ConcurrentHashMap<String, AbstractC3937gA> trackers;

    public C1734Oz0(@NotNull InterfaceC1953Ru0 _sessionService, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull C7582xI _configModelStore, @NotNull InterfaceC6659su0 preferences, @NotNull InterfaceC4092gv0 timeProvider) {
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this._sessionService = _sessionService;
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        ConcurrentHashMap<String, AbstractC3937gA> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        C1656Nz0 c1656Nz0 = new C1656Nz0(preferences, _configModelStore);
        this.dataRepository = c1656Nz0;
        C1575Mz0 c1575Mz0 = C1575Mz0.INSTANCE;
        concurrentHashMap.put(c1575Mz0.getIAM_TAG(), new C4556ix0(c1656Nz0, timeProvider));
        concurrentHashMap.put(c1575Mz0.getNOTIFICATION_TAG(), new U61(c1656Nz0, timeProvider));
        _sessionService.subscribe(this);
        Collection<AbstractC3937gA> collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "trackers.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((AbstractC3937gA) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(EnumC0894Eg entryAction, String directId) {
        boolean sessionTracker;
        C1342Jz0 currentSessionInfluence;
        NS0.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + entryAction + ", directId: " + directId + ')', null, 2, null);
        InterfaceC4293hs0 channelByEntryAction = getChannelByEntryAction(entryAction);
        List<InterfaceC4293hs0> channelsToResetByEntryAction = getChannelsToResetByEntryAction(entryAction);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            currentSessionInfluence = channelByEntryAction.getCurrentSessionInfluence();
            EnumC1890Qz0 enumC1890Qz0 = EnumC1890Qz0.DIRECT;
            if (directId == null) {
                directId = channelByEntryAction.getDirectId();
            }
            sessionTracker = setSessionTracker(channelByEntryAction, enumC1890Qz0, directId, null);
        } else {
            sessionTracker = false;
            currentSessionInfluence = null;
        }
        if (sessionTracker) {
            NS0.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            Intrinsics.checkNotNull(currentSessionInfluence);
            arrayList.add(currentSessionInfluence);
            for (InterfaceC4293hs0 interfaceC4293hs0 : channelsToResetByEntryAction) {
                EnumC1890Qz0 influenceType = interfaceC4293hs0.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(interfaceC4293hs0.getCurrentSessionInfluence());
                    interfaceC4293hs0.resetAndInitInfluence();
                }
            }
        }
        NS0.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (InterfaceC4293hs0 interfaceC4293hs1 : channelsToResetByEntryAction) {
            EnumC1890Qz0 influenceType2 = interfaceC4293hs1.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = interfaceC4293hs1.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !entryAction.isAppClose()) {
                    C1342Jz0 currentSessionInfluence2 = interfaceC4293hs1.getCurrentSessionInfluence();
                    if (setSessionTracker(interfaceC4293hs1, EnumC1890Qz0.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence2);
                    }
                }
            }
        }
        NS0.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(C1734Oz0 c1734Oz0, EnumC0894Eg enumC0894Eg, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c1734Oz0.attemptSessionUpgrade(enumC0894Eg, str);
    }

    private final InterfaceC4293hs0 getChannelByEntryAction(EnumC0894Eg entryAction) {
        if (entryAction.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    private final List<InterfaceC4293hs0> getChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNotificationChannelTracker());
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final List<InterfaceC4293hs0> getChannelsToResetByEntryAction(EnumC0894Eg entryAction) {
        ArrayList arrayList = new ArrayList();
        if (entryAction.isAppClose()) {
            return arrayList;
        }
        InterfaceC4293hs0 notificationChannelTracker = entryAction.isAppOpen() ? getNotificationChannelTracker() : null;
        if (notificationChannelTracker != null) {
            arrayList.add(notificationChannelTracker);
        }
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final InterfaceC4293hs0 getIAMChannelTracker() {
        AbstractC3937gA abstractC3937gA = this.trackers.get(C1575Mz0.INSTANCE.getIAM_TAG());
        Intrinsics.checkNotNull(abstractC3937gA);
        return abstractC3937gA;
    }

    private final InterfaceC4293hs0 getNotificationChannelTracker() {
        AbstractC3937gA abstractC3937gA = this.trackers.get(C1575Mz0.INSTANCE.getNOTIFICATION_TAG());
        Intrinsics.checkNotNull(abstractC3937gA);
        return abstractC3937gA;
    }

    private final void restartSessionTrackersIfNeeded(EnumC0894Eg entryAction) {
        List<InterfaceC4293hs0> channelsToResetByEntryAction = getChannelsToResetByEntryAction(entryAction);
        ArrayList arrayList = new ArrayList();
        NS0.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + entryAction + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (InterfaceC4293hs0 interfaceC4293hs0 : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = interfaceC4293hs0.getLastReceivedIds();
            NS0.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            C1342Jz0 currentSessionInfluence = interfaceC4293hs0.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(interfaceC4293hs0, EnumC1890Qz0.INDIRECT, null, lastReceivedIds) : setSessionTracker(interfaceC4293hs0, EnumC1890Qz0.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(InterfaceC4293hs0 channelTracker, EnumC1890Qz0 influenceType, String directNotificationId, JSONArray indirectNotificationIds) {
        if (!willChangeSessionTracker(channelTracker, influenceType, directNotificationId, indirectNotificationIds)) {
            return false;
        }
        NS0.debug$default(DS1.b("\n            ChannelTracker changed: " + channelTracker.getIdTag() + "\n            from:\n            influenceType: " + channelTracker.getInfluenceType() + ", directNotificationId: " + channelTracker.getDirectId() + ", indirectNotificationIds: " + channelTracker.getIndirectIds() + "\n            to:\n            influenceType: " + influenceType + ", directNotificationId: " + directNotificationId + ", indirectNotificationIds: " + indirectNotificationIds + "\n            "), null, 2, null);
        channelTracker.setInfluenceType(influenceType);
        channelTracker.setDirectId(directNotificationId);
        channelTracker.setIndirectIds(indirectNotificationIds);
        channelTracker.cacheState();
        StringBuilder sb = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb.append(getChannels());
        NS0.debug$default(sb.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(InterfaceC4293hs0 channelTracker, EnumC1890Qz0 influenceType, String directNotificationId, JSONArray indirectNotificationIds) {
        if (influenceType != channelTracker.getInfluenceType()) {
            return true;
        }
        EnumC1890Qz0 influenceType2 = channelTracker.getInfluenceType();
        if (influenceType2 != null && influenceType2.isDirect() && channelTracker.getDirectId() != null && !Intrinsics.a(channelTracker.getDirectId(), directNotificationId)) {
            return true;
        }
        if (influenceType2 == null || !influenceType2.isIndirect() || channelTracker.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = channelTracker.getIndirectIds();
        Intrinsics.checkNotNull(indirectIds);
        return indirectIds.length() > 0 && !KD0.INSTANCE.compareJSONArrays(channelTracker.getIndirectIds(), indirectNotificationIds);
    }

    @Override // defpackage.InterfaceC3247ct0
    @NotNull
    public List<C1342Jz0> getInfluences() {
        Collection<AbstractC3937gA> collectionValues = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "trackers.values");
        Collection<AbstractC3937gA> collection = collectionValues;
        ArrayList arrayList = new ArrayList(XE.m(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC3937gA) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC3247ct0
    public void onDirectInfluenceFromIAM(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        NS0.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + messageId + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), EnumC1890Qz0.DIRECT, messageId, null);
    }

    @Override // defpackage.InterfaceC3247ct0
    public void onDirectInfluenceFromNotification(@NotNull String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        NS0.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        attemptSessionUpgrade(EnumC0894Eg.NOTIFICATION_CLICK, notificationId);
    }

    @Override // defpackage.InterfaceC3247ct0
    public void onInAppMessageDismissed() {
        NS0.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // defpackage.InterfaceC3247ct0
    public void onInAppMessageDisplayed(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        NS0.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + messageId + ')', null, 2, null);
        InterfaceC4293hs0 iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(messageId);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // defpackage.InterfaceC3247ct0
    public void onNotificationReceived(@NotNull String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        NS0.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(notificationId);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionEnded(long duration) {
    }
}
