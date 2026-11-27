package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\r\u001a\u0004\u0018\u00010\b2 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lqv0;", "Lis0;", "", "key", "<init>", "(Ljava/lang/String;)V", "", "Lks0;", "LGB1;", "indexedTokens", "", "isMet", "(Ljava/util/Map;)Z", "getRywData", "(Ljava/util/Map;)LGB1;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6243qv0 implements InterfaceC4542is0 {

    @NotNull
    public static final String ID = "IamFetchReadyCondition";

    @NotNull
    private final String key;

    public C6243qv0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // defpackage.InterfaceC4542is0
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // defpackage.InterfaceC4542is0
    @Nullable
    public GB1 getRywData(@NotNull Map<String, ? extends Map<InterfaceC4971ks0, GB1>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<InterfaceC4971ks0, GB1> map = indexedTokens.get(this.key);
        Object next = null;
        if (map == null) {
            return null;
        }
        GB1[] elements = {map.get(EnumC6452rv0.USER), map.get(EnumC6452rv0.SUBSCRIPTION)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = C1526Mj.o(elements).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String rywToken = ((GB1) next).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next2 = it.next();
                    String rywToken2 = ((GB1) next2).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        next = next2;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (GB1) next;
    }

    @Override // defpackage.InterfaceC4542is0
    public boolean isMet(@NotNull Map<String, ? extends Map<InterfaceC4971ks0, GB1>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<InterfaceC4971ks0, GB1> map = indexedTokens.get(this.key);
        return (map == null || map.get(EnumC6452rv0.USER) == null) ? false : true;
    }
}
