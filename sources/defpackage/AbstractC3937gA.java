package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0010R$\u00102\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0015R\u0014\u00106\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00107R\u0014\u00109\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010;\u001a\u00020\n8fX¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00100R\u0014\u0010=\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001fR\u0014\u0010?\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001fR\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00100¨\u0006F"}, d2 = {"LgA;", "Lhs0;", "LNz0;", "dataRepository", "Lgv0;", "timeProvider", "<init>", "(LNz0;Lgv0;)V", "", "id", "Lorg/json/JSONArray;", "getLastChannelObjectsReceivedByNewId", "(Ljava/lang/String;)Lorg/json/JSONArray;", "channelObjects", "", "saveChannelObjects", "(Lorg/json/JSONArray;)V", "initInfluencedTypeFromCache", "()V", "resetAndInitInfluence", "saveLastId", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LNz0;", "getDataRepository", "()LNz0;", "setDataRepository", "(LNz0;)V", "Lgv0;", "LQz0;", "influenceType", "LQz0;", "getInfluenceType", "()LQz0;", "setInfluenceType", "(LQz0;)V", "indirectIds", "Lorg/json/JSONArray;", "getIndirectIds", "()Lorg/json/JSONArray;", "setIndirectIds", "directId", "Ljava/lang/String;", "getDirectId", "setDirectId", "isDirectSessionEnabled", "()Z", "isIndirectSessionEnabled", "isUnattributedSessionEnabled", "getLastChannelObjects", "lastChannelObjects", "getChannelLimit", "channelLimit", "getIndirectAttributionWindow", "indirectAttributionWindow", "LJz0;", "getCurrentSessionInfluence", "()LJz0;", "currentSessionInfluence", "getLastReceivedIds", "lastReceivedIds", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbstractC3937gA implements InterfaceC4293hs0 {

    @NotNull
    private C1656Nz0 dataRepository;

    @Nullable
    private String directId;

    @Nullable
    private JSONArray indirectIds;

    @Nullable
    private EnumC1890Qz0 influenceType;

    @NotNull
    private InterfaceC4092gv0 timeProvider;

    public AbstractC3937gA(@NotNull C1656Nz0 dataRepository, @NotNull InterfaceC4092gv0 timeProvider) {
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.dataRepository = dataRepository;
        this.timeProvider = timeProvider;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    @Override // defpackage.InterfaceC4293hs0
    public abstract /* synthetic */ void cacheState();

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass().equals(other.getClass())) {
            AbstractC3937gA abstractC3937gA = (AbstractC3937gA) other;
            if (getInfluenceType() == abstractC3937gA.getInfluenceType() && Intrinsics.a(abstractC3937gA.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // defpackage.InterfaceC4293hs0
    @NotNull
    public abstract /* synthetic */ EnumC1420Kz0 getChannelType();

    @Override // defpackage.InterfaceC4293hs0
    @NotNull
    public C1342Jz0 getCurrentSessionInfluence() {
        EnumC1420Kz0 channelType = getChannelType();
        EnumC1890Qz0 enumC1890Qz0 = EnumC1890Qz0.DISABLED;
        C1342Jz0 c1342Jz0 = new C1342Jz0(channelType, enumC1890Qz0, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        EnumC1890Qz0 influenceType = getInfluenceType();
        if (influenceType != null) {
            enumC1890Qz0 = influenceType;
        }
        if (enumC1890Qz0.isDirect()) {
            if (isDirectSessionEnabled()) {
                c1342Jz0.setIds(new JSONArray().put(getDirectId()));
                c1342Jz0.setInfluenceType(EnumC1890Qz0.DIRECT);
                return c1342Jz0;
            }
        } else if (enumC1890Qz0.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                c1342Jz0.setIds(getIndirectIds());
                c1342Jz0.setInfluenceType(EnumC1890Qz0.INDIRECT);
                return c1342Jz0;
            }
        } else if (isUnattributedSessionEnabled()) {
            c1342Jz0.setInfluenceType(EnumC1890Qz0.UNATTRIBUTED);
        }
        return c1342Jz0;
    }

    @NotNull
    public final C1656Nz0 getDataRepository() {
        return this.dataRepository;
    }

    @Override // defpackage.InterfaceC4293hs0
    @Nullable
    public String getDirectId() {
        return this.directId;
    }

    @Override // defpackage.InterfaceC4293hs0
    @NotNull
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // defpackage.InterfaceC4293hs0
    @Nullable
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // defpackage.InterfaceC4293hs0
    @Nullable
    public EnumC1890Qz0 getInfluenceType() {
        return this.influenceType;
    }

    @NotNull
    public abstract JSONArray getLastChannelObjects();

    @NotNull
    public abstract JSONArray getLastChannelObjectsReceivedByNewId(@Nullable String id);

    @Override // defpackage.InterfaceC4293hs0
    @NotNull
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            NS0.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i);
                if (currentTimeMillis - jSONObject.getLong(C1575Mz0.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
        } catch (JSONException e) {
            NS0.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    public int hashCode() {
        EnumC1890Qz0 influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // defpackage.InterfaceC4293hs0
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? EnumC1890Qz0.INDIRECT : EnumC1890Qz0.UNATTRIBUTED);
        cacheState();
        NS0.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(@NotNull JSONArray channelObjects);

    @Override // defpackage.InterfaceC4293hs0
    public void saveLastId(@Nullable String id) {
        StringBuilder sbB = C6495s7.b("ChannelTracker.saveLastId(id: ", id, "): idTag=");
        sbB.append(getIdTag());
        NS0.debug$default(sbB.toString(), null, 2, null);
        if (id == null || id.length() == 0) {
            return;
        }
        JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(id);
        NS0.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
        try {
            lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), id).put(C1575Mz0.TIME, this.timeProvider.getCurrentTimeMillis()));
            if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjectsReceivedByNewId.length();
                for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                    try {
                        jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                    } catch (JSONException e) {
                        NS0.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            NS0.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e2) {
            NS0.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e2);
        }
    }

    public final void setDataRepository(@NotNull C1656Nz0 c1656Nz0) {
        Intrinsics.checkNotNullParameter(c1656Nz0, "<set-?>");
        this.dataRepository = c1656Nz0;
    }

    @Override // defpackage.InterfaceC4293hs0
    public void setDirectId(@Nullable String str) {
        this.directId = str;
    }

    @Override // defpackage.InterfaceC4293hs0
    public void setIndirectIds(@Nullable JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // defpackage.InterfaceC4293hs0
    public void setInfluenceType(@Nullable EnumC1890Qz0 enumC1890Qz0) {
        this.influenceType = enumC1890Qz0;
    }

    @NotNull
    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
