package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"LUa2;", "Lmv0;", "LGs0;", "_httpClient", "<init>", "(LGs0;)V", "", "appId", "", "identities", "", "LDU1;", "subscriptions", "properties", "LQP;", "createUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;LJM;)Ljava/lang/Object;", "aliasLabel", "aliasValue", "Lsj1;", "", "refreshDeviceMetadata", "Lnj1;", "propertyiesDelta", "LGB1;", "updateUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsj1;ZLnj1;LJM;)Ljava/lang/Object;", "getUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "LGs0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Ua2 implements InterfaceC5403mv0 {

    @NotNull
    private final InterfaceC1087Gs0 _httpClient;

    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.UserBackendService", f = "UserBackendService.kt", l = {42}, m = "createUser")
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
            return Ua2.this.createUser(null, null, null, null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.UserBackendService", f = "UserBackendService.kt", l = {94}, m = "getUser")
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
            return Ua2.this.getUser(null, null, null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.UserBackendService", f = "UserBackendService.kt", l = {71}, m = "updateUser")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
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
            return Ua2.this.updateUser(null, null, null, null, false, null, this);
        }
    }

    public Ua2(@NotNull InterfaceC1087Gs0 _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC5403mv0
    @Nullable
    public Object createUser(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<DU1> list, @NotNull Map<String, String> map2, @NotNull JM<? super QP> jm) throws JSONException, C7063up {
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
        Object objPost$default = aVar2.result;
        MN mn = MN.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objPost$default);
            JSONObject jSONObject = new JSONObject();
            if (!map.isEmpty()) {
                jSONObject.put("identity", JD0.putMap(new JSONObject(), map));
            }
            if (!list.isEmpty()) {
                jSONObject.put("subscriptions", HD0.INSTANCE.convertToJSON(list));
            }
            if (!map2.isEmpty()) {
                jSONObject.put("properties", JD0.putMap(new JSONObject(), map2));
            }
            jSONObject.put("refresh_device_metadata", true);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strD = C1039Gc0.d("apps/", str, "/users");
            aVar2.label = 1;
            objPost$default = InterfaceC1087Gs0.a.post$default(interfaceC1087Gs0, strD, jSONObject, null, aVar2, 4, null);
            if (objPost$default == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objPost$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPost$default;
        if (!c5178lr0.isSuccess()) {
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        HD0 hd0 = HD0.INSTANCE;
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        return hd0.convertToCreateUserResponse(new JSONObject(payload));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC5403mv0
    @Nullable
    public Object getUser(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JM<? super QP> jm) throws C7063up {
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
        Object obj = bVar2.result;
        MN mn = MN.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            bVar2.label = 1;
            obj = InterfaceC1087Gs0.a.get$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, null, bVar2, 2, null);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        C5178lr0 c5178lr0 = (C5178lr0) obj;
        if (c5178lr0.isSuccess()) {
            return HD0.INSTANCE.convertToCreateUserResponse(new JSONObject(c5178lr0.getPayload()));
        }
        throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC5403mv0
    @Nullable
    public Object updateUser(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull C6623sj1 c6623sj1, boolean z, @NotNull C5574nj1 c5574nj1, @NotNull JM<? super GB1> jm) throws JSONException, C7063up {
        c cVar;
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
        Object objPatch$default = cVar.result;
        MN mn = MN.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objPatch$default);
            JSONObject jsonObject = new JSONObject().put("refresh_device_metadata", z);
            if (c6623sj1.getHasAtLeastOnePropertySet()) {
                jsonObject.put("properties", HD0.INSTANCE.convertToJSON(c6623sj1));
            }
            if (c5574nj1.getHasAtLeastOnePropertySet()) {
                jsonObject.put("deltas", HD0.INSTANCE.convertToJSON(c5574nj1));
            }
            Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
            cVar.label = 1;
            objPatch$default = InterfaceC1087Gs0.a.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, jsonObject, null, cVar, 4, null);
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
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        String strSafeString = jSONObject != null ? JD0.safeString(jSONObject, "ryw_token") : null;
        Long lSafeLong = jSONObject != null ? JD0.safeLong(jSONObject, "ryw_delay") : null;
        if (strSafeString != null) {
            return new GB1(strSafeString, lSafeLong);
        }
        return null;
    }
}
