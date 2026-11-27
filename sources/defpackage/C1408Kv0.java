package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Kv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"LKv0;", "LJs0;", "LGs0;", "_httpClient", "<init>", "(LGs0;)V", "", "appId", "aliasLabel", "aliasValue", "", "identities", "setAlias", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LJM;)Ljava/lang/Object;", "aliasLabelToDelete", "", "deleteAlias", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "LGs0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1408Kv0 implements InterfaceC1321Js0 {

    @NotNull
    private final InterfaceC1087Gs0 _httpClient;

    /* JADX INFO: renamed from: Kv0$a */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.IdentityBackendService", f = "IdentityBackendService.kt", l = {RequestError.NETWORK_FAILURE}, m = "deleteAlias")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        int label;
        /* synthetic */ Object result;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1408Kv0.this.deleteAlias(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Kv0$b */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.IdentityBackendService", f = "IdentityBackendService.kt", l = {ConnectionResult.API_DISABLED}, m = "setAlias")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1408Kv0.this.setAlias(null, null, null, null, this);
        }
    }

    public C1408Kv0(@NotNull InterfaceC1087Gs0 _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC1321Js0
    @Nullable
    public Object deleteAlias(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull JM<? super Unit> jm) throws C7063up {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        a aVar2 = aVar;
        Object objDelete$default = aVar2.result;
        MN mn = MN.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objDelete$default);
            aVar2.label = 1;
            objDelete$default = InterfaceC1087Gs0.a.delete$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, null, aVar2, 2, null);
            if (objDelete$default == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objDelete$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objDelete$default;
        if (c5178lr0.isSuccess()) {
            return Unit.a;
        }
        throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC1321Js0
    @Nullable
    public Object setAlias(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull JM<? super Map<String, String>> jm) throws JSONException, C7063up {
        b bVar;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        b bVar2 = bVar;
        Object objPatch$default = bVar2.result;
        MN mn = MN.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objPatch$default);
            JSONObject requestJSONObject = new JSONObject().put("identity", JD0.putMap(new JSONObject(), map));
            Intrinsics.checkNotNullExpressionValue(requestJSONObject, "requestJSONObject");
            bVar2.label = 1;
            objPatch$default = InterfaceC1087Gs0.a.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", requestJSONObject, null, bVar2, 4, null);
            if (objPatch$default == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objPatch$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPatch$default;
        if (!c5178lr0.isSuccess()) {
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        JSONObject jSONObject = new JSONObject(payload).getJSONObject("identity");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "responseJSON.getJSONObject(\"identity\")");
        Map<String, Object> map2 = JD0.toMap(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap(OW0.a(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }
}
