package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: vU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"LvU1;", "Lav0;", "LGs0;", "_httpClient", "<init>", "(LGs0;)V", "", "appId", "aliasLabel", "aliasValue", "LDU1;", "subscription", "Lkotlin/Pair;", "LGB1;", "createSubscription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LDU1;LJM;)Ljava/lang/Object;", "subscriptionId", "updateSubscription", "(Ljava/lang/String;Ljava/lang/String;LDU1;LJM;)Ljava/lang/Object;", "", "deleteSubscription", "(Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "transferSubscription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "", "getIdentityFromSubscription", "LGs0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7199vU1 implements InterfaceC2834av0 {

    @NotNull
    private final InterfaceC1087Gs0 _httpClient;

    /* JADX INFO: renamed from: vU1$a */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", l = {27}, m = "createSubscription")
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
            return C7199vU1.this.createSubscription(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vU1$b */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", l = {81}, m = "deleteSubscription")
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
            return C7199vU1.this.deleteSubscription(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vU1$c */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", l = {109}, m = "getIdentityFromSubscription")
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
            return C7199vU1.this.getIdentityFromSubscription(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vU1$d */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", l = {98}, m = "transferSubscription")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C7199vU1.this.transferSubscription(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vU1$e */
    @InterfaceC3368dU(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", l = {59}, m = "updateSubscription")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        int label;
        /* synthetic */ Object result;

        public e(JM<? super e> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C7199vU1.this.updateSubscription(null, null, null, this);
        }
    }

    public C7199vU1(@NotNull InterfaceC1087Gs0 _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC2834av0
    @Nullable
    public Object createSubscription(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DU1 du1, @NotNull JM<? super Pair<String, GB1>> jm) throws JSONException, C7063up {
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
            JSONObject jSONObjectConvertToJSON = HD0.INSTANCE.convertToJSON(du1);
            jSONObjectConvertToJSON.remove("id");
            JSONObject requestJSON = new JSONObject().put("subscription", jSONObjectConvertToJSON);
            Intrinsics.checkNotNullExpressionValue(requestJSON, "requestJSON");
            aVar2.label = 1;
            objPost$default = InterfaceC1087Gs0.a.post$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", requestJSON, null, aVar2, 4, null);
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
        String payload = c5178lr0.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        JSONObject jSONObjectSafeJSONObject = jSONObject != null ? JD0.safeJSONObject(jSONObject, "subscription") : null;
        if (jSONObjectSafeJSONObject == null || !jSONObjectSafeJSONObject.has("id")) {
            return null;
        }
        String strSafeString = JD0.safeString(jSONObject, "ryw_token");
        return new Pair(jSONObjectSafeJSONObject.getString("id"), strSafeString != null ? new GB1(strSafeString, JD0.safeLong(jSONObject, "ryw_delay")) : null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC2834av0
    @Nullable
    public Object deleteSubscription(@NotNull String str, @NotNull String str2, @NotNull JM<? super Unit> jm) throws C7063up {
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
        Object objDelete$default = bVar2.result;
        MN mn = MN.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objDelete$default);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strC = BX.c("apps/", str, "/subscriptions/", str2);
            bVar2.label = 1;
            objDelete$default = InterfaceC1087Gs0.a.delete$default(interfaceC1087Gs0, strC, null, bVar2, 2, null);
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
    @Override // defpackage.InterfaceC2834av0
    @Nullable
    public Object getIdentityFromSubscription(@NotNull String str, @NotNull String str2, @NotNull JM<? super Map<String, String>> jm) throws C7063up {
        c cVar;
        Map<String, Object> map;
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
        c cVar2 = cVar;
        Object obj = cVar2.result;
        MN mn = MN.d;
        int i2 = cVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strA = C4694ja0.a("apps/", str, "/subscriptions/", str2, "/user/identity");
            cVar2.label = 1;
            obj = InterfaceC1087Gs0.a.get$default(interfaceC1087Gs0, strA, null, cVar2, 2, null);
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
        if (!c5178lr0.isSuccess()) {
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        JSONObject jSONObjectSafeJSONObject = JD0.safeJSONObject(new JSONObject(payload), "identity");
        if (jSONObjectSafeJSONObject == null || (map = JD0.toMap(jSONObjectSafeJSONObject)) == null) {
            return PW0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(OW0.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC2834av0
    @Nullable
    public Object transferSubscription(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull JM<? super Unit> jm) throws JSONException, C7063up {
        d dVar;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        d dVar2 = dVar;
        Object objPatch$default = dVar2.result;
        MN mn = MN.d;
        int i2 = dVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objPatch$default);
            JSONObject requestJSON = new JSONObject().put("identity", new JSONObject().put(str3, str4));
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strA = C4694ja0.a("apps/", str, "/subscriptions/", str2, "/owner");
            Intrinsics.checkNotNullExpressionValue(requestJSON, "requestJSON");
            dVar2.label = 1;
            objPatch$default = InterfaceC1087Gs0.a.patch$default(interfaceC1087Gs0, strA, requestJSON, null, dVar2, 4, null);
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
        if (c5178lr0.isSuccess()) {
            return Unit.a;
        }
        throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC2834av0
    @Nullable
    public Object updateSubscription(@NotNull String str, @NotNull String str2, @NotNull DU1 du1, @NotNull JM<? super GB1> jm) throws JSONException, C7063up {
        e eVar;
        if (jm instanceof e) {
            eVar = (e) jm;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(jm);
            }
        } else {
            eVar = new e(jm);
        }
        e eVar2 = eVar;
        Object objPatch$default = eVar2.result;
        MN mn = MN.d;
        int i2 = eVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objPatch$default);
            JSONObject requestJSON = new JSONObject().put("subscription", HD0.INSTANCE.convertToJSON(du1));
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strC = BX.c("apps/", str, "/subscriptions/", str2);
            Intrinsics.checkNotNullExpressionValue(requestJSON, "requestJSON");
            eVar2.label = 1;
            objPatch$default = InterfaceC1087Gs0.a.patch$default(interfaceC1087Gs0, strC, requestJSON, null, eVar2, 4, null);
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
