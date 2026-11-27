package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC2101Tr1;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.XE;
import defpackage.XO0;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a implements InterfaceC2101Tr1 {

    @NotNull
    public static final Object c = XO0.a(EnumC4403iP0.e, C0385a.d);

    @NotNull
    public static final HashSet<String> d;

    @Nullable
    public String a;
    public final Map<C0702Bu, io.sentry.util.network.d> b;

    /* JADX INFO: renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    public static final class C0385a extends ML0 implements Function0<Regex> {
        public static final C0385a d = new C0385a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    }

    public final class b implements C2688aH1.a {

        @Nullable
        public final C2688aH1.a d;

        public b(C2688aH1.a aVar) {
            this.d = aVar;
        }

        @Override // defpackage.C2688aH1.a
        @Nullable
        public final C0702Bu a(@NotNull C0702Bu breadcrumb, @NotNull C0841Do0 hint) {
            Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
            Intrinsics.checkNotNullParameter(hint, "hint");
            C2688aH1.a aVar = this.d;
            if (aVar != null) {
                breadcrumb = aVar.a(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                io.sentry.util.network.d dVar = null;
                if (Intrinsics.a(breadcrumb.i, "http") || Intrinsics.a(breadcrumb.k, "http")) {
                    Object objB = hint.b("sentry:replayNetworkDetails");
                    if (objB instanceof io.sentry.util.network.d) {
                        dVar = (io.sentry.util.network.d) objB;
                    }
                }
                if (dVar != null) {
                    Map<C0702Bu, io.sentry.util.network.d> map = a.this.b;
                    Intrinsics.checkNotNullExpressionValue(map, "access$getHttpNetworkDetails$p(...)");
                    map.put(breadcrumb, dVar);
                }
            }
            return breadcrumb;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public a(@NotNull SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.b = Collections.synchronizedMap(new io.sentry.android.replay.b());
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new b(options.getBeforeBreadcrumb()));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x029d  */
    /* JADX WARN: Code duplicated, block: B:177:0x03df  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205  */
    /* JADX WARN: Type inference failed for: r4v6, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC2101Tr1
    @Nullable
    public final io.sentry.rrweb.b a(@NotNull C0702Bu breadcrumb) {
        String str;
        NG1 ng1;
        Object obj;
        String strW;
        double dLongValue;
        double dLongValue2;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.a(breadcrumb.k, "http")) {
            Object obj2 = breadcrumb.j.get(ImagesContract.URL);
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                if (str2.length() != 0) {
                    ConcurrentHashMap concurrentHashMap = breadcrumb.j;
                    Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
                    if (concurrentHashMap.containsKey("http.start_timestamp")) {
                        ConcurrentHashMap concurrentHashMap2 = breadcrumb.j;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap2, "getData(...)");
                        if (concurrentHashMap2.containsKey("http.end_timestamp")) {
                            Object obj3 = breadcrumb.j.get("http.start_timestamp");
                            Object obj4 = breadcrumb.j.get("http.end_timestamp");
                            io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                            iVar.e = breadcrumb.e().getTime();
                            iVar.h = "resource.http";
                            Object obj5 = breadcrumb.j.get(ImagesContract.URL);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            iVar.i = (String) obj5;
                            if (obj3 instanceof Double) {
                                dLongValue = ((Number) obj3).doubleValue();
                            } else {
                                Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                                dLongValue = ((Long) obj3).longValue();
                            }
                            iVar.j = dLongValue / 1000.0d;
                            if (obj4 instanceof Double) {
                                dLongValue2 = ((Number) obj4).doubleValue();
                            } else {
                                Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                                dLongValue2 = ((Long) obj4).longValue();
                            }
                            iVar.k = dLongValue2 / 1000.0d;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            io.sentry.util.network.d dVarRemove = this.b.remove(breadcrumb);
                            if (dVarRemove != null) {
                                String str3 = dVarRemove.a;
                                if (str3 != null) {
                                    linkedHashMap2.put("method", str3);
                                }
                                Integer num = dVarRemove.b;
                                if (num != null) {
                                    linkedHashMap2.put("statusCode", num);
                                }
                                Long l = dVarRemove.c;
                                if (l != null) {
                                    linkedHashMap2.put("requestBodySize", l);
                                }
                                Long l2 = dVarRemove.d;
                                if (l2 != null) {
                                    linkedHashMap2.put("responseBodySize", l2);
                                }
                                io.sentry.util.network.e eVar = dVarRemove.e;
                                if (eVar != null) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    Long l3 = eVar.a;
                                    if (l3 != null) {
                                        linkedHashMap3.put("size", l3);
                                    }
                                    io.sentry.util.network.a aVar = eVar.b;
                                    if (aVar != null) {
                                        linkedHashMap3.put("body", aVar.a);
                                        List<io.sentry.util.network.a.EnumC0405a> list = aVar.b;
                                        if (list != null) {
                                            Intrinsics.checkNotNull(list);
                                            ArrayList arrayList = new ArrayList(XE.m(list, 10));
                                            Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((io.sentry.util.network.a.EnumC0405a) it.next()).getValue());
                                            }
                                            linkedHashMap3.put("warnings", arrayList);
                                        }
                                    }
                                    LinkedHashMap linkedHashMap4 = eVar.c;
                                    Intrinsics.checkNotNullExpressionValue(linkedHashMap4, "getHeaders(...)");
                                    if (!linkedHashMap4.isEmpty()) {
                                        linkedHashMap3.put("headers", linkedHashMap4);
                                    }
                                    if (!linkedHashMap3.isEmpty()) {
                                        linkedHashMap2.put("request", linkedHashMap3);
                                    }
                                }
                                io.sentry.util.network.e eVar2 = dVarRemove.f;
                                if (eVar2 != null) {
                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                    Long l4 = eVar2.a;
                                    if (l4 != null) {
                                        linkedHashMap5.put("size", l4);
                                    }
                                    io.sentry.util.network.a aVar2 = eVar2.b;
                                    if (aVar2 != null) {
                                        linkedHashMap5.put("body", aVar2.a);
                                        List<io.sentry.util.network.a.EnumC0405a> list2 = aVar2.b;
                                        if (list2 != null) {
                                            Intrinsics.checkNotNull(list2);
                                            ArrayList arrayList2 = new ArrayList(XE.m(list2, 10));
                                            Iterator<T> it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(((io.sentry.util.network.a.EnumC0405a) it2.next()).getValue());
                                            }
                                            linkedHashMap5.put("warnings", arrayList2);
                                        }
                                    }
                                    LinkedHashMap linkedHashMap6 = eVar2.c;
                                    Intrinsics.checkNotNullExpressionValue(linkedHashMap6, "getHeaders(...)");
                                    if (!linkedHashMap6.isEmpty()) {
                                        linkedHashMap5.put("headers", linkedHashMap6);
                                    }
                                    if (!linkedHashMap5.isEmpty()) {
                                        linkedHashMap2.put(Payload.RESPONSE, linkedHashMap5);
                                    }
                                }
                            }
                            ConcurrentHashMap concurrentHashMap3 = breadcrumb.j;
                            Intrinsics.checkNotNullExpressionValue(concurrentHashMap3, "getData(...)");
                            for (Map.Entry entry : concurrentHashMap3.entrySet()) {
                                String str4 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (d.contains(str4)) {
                                    Intrinsics.checkNotNull(str4);
                                    String strM = kotlin.text.d.m(str4, "content_length", "body_size");
                                    linkedHashMap2.put(((Regex) c.getValue()).e(StringsKt.V(strM, ".", strM), c.d), value);
                                }
                            }
                            iVar.l = new ConcurrentHashMap(linkedHashMap2);
                            return iVar;
                        }
                    }
                }
            }
        } else {
            String str5 = "navigation";
            if (Intrinsics.a(breadcrumb.i, "navigation") && Intrinsics.a(breadcrumb.k, "app.lifecycle")) {
                str5 = "app." + breadcrumb.j.get("state");
            } else if (Intrinsics.a(breadcrumb.i, "navigation") && Intrinsics.a(breadcrumb.k, "device.orientation")) {
                str5 = breadcrumb.k;
                Intrinsics.checkNotNull(str5);
                Object obj6 = breadcrumb.j.get("position");
                if (Intrinsics.a(obj6, "landscape") || Intrinsics.a(obj6, "portrait")) {
                    linkedHashMap.put("position", obj6);
                }
            } else if (Intrinsics.a(breadcrumb.i, "navigation")) {
                if (Intrinsics.a(breadcrumb.j.get("state"), "resumed")) {
                    Object obj7 = breadcrumb.j.get("screen");
                    String str6 = obj7 instanceof String ? (String) obj7 : null;
                    if (str6 != null) {
                        strW = StringsKt.W(JwtParser.SEPARATOR_CHAR, str6, str6);
                    } else {
                        strW = null;
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap4 = breadcrumb.j;
                    Intrinsics.checkNotNullExpressionValue(concurrentHashMap4, "getData(...)");
                    if (concurrentHashMap4.containsKey("to")) {
                        Object obj8 = breadcrumb.j.get("to");
                        if (obj8 instanceof String) {
                            strW = (String) obj8;
                        } else {
                            strW = null;
                        }
                    } else {
                        strW = null;
                    }
                }
                if (strW != null) {
                    linkedHashMap.put("to", strW);
                }
            } else if (Intrinsics.a(breadcrumb.k, "ui.click")) {
                Object obj9 = breadcrumb.j.get("view.id");
                if (obj9 == null && (obj9 = breadcrumb.j.get("view.tag")) == null) {
                    obj9 = breadcrumb.j.get("view.class");
                }
                String str7 = obj9 instanceof String ? (String) obj9 : null;
                if (str7 != null) {
                    ConcurrentHashMap concurrentHashMap5 = breadcrumb.j;
                    Intrinsics.checkNotNullExpressionValue(concurrentHashMap5, "getData(...)");
                    linkedHashMap.putAll(concurrentHashMap5);
                    str5 = "ui.tap";
                    str = str7;
                    ng1 = null;
                    if (str5 != null && str5.length() != 0) {
                        io.sentry.rrweb.a aVar3 = new io.sentry.rrweb.a();
                        aVar3.e = breadcrumb.e().getTime();
                        aVar3.h = breadcrumb.e().getTime() / 1000.0d;
                        aVar3.i = "default";
                        aVar3.j = str5;
                        aVar3.k = str;
                        aVar3.l = ng1;
                        aVar3.m = new ConcurrentHashMap(linkedHashMap);
                        return aVar3;
                    }
                }
            } else {
                if (Intrinsics.a(breadcrumb.i, "system") && Intrinsics.a(breadcrumb.k, "network.event")) {
                    if (Intrinsics.a(breadcrumb.j.get("action"), "NETWORK_LOST")) {
                        obj = "offline";
                    } else {
                        ConcurrentHashMap concurrentHashMap6 = breadcrumb.j;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap6, "getData(...)");
                        if (concurrentHashMap6.containsKey("network_type")) {
                            Object obj10 = breadcrumb.j.get("network_type");
                            String str8 = obj10 instanceof String ? (String) obj10 : null;
                            if (str8 != null && str8.length() != 0) {
                                obj = breadcrumb.j.get("network_type");
                            }
                        }
                    }
                    linkedHashMap.put("state", obj);
                    if (!Intrinsics.a(this.a, linkedHashMap.get("state"))) {
                        Object obj11 = linkedHashMap.get("state");
                        this.a = obj11 instanceof String ? (String) obj11 : null;
                        str5 = "device.connectivity";
                    }
                } else {
                    if (Intrinsics.a(breadcrumb.j.get("action"), "BATTERY_CHANGED")) {
                        ConcurrentHashMap concurrentHashMap7 = breadcrumb.j;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap7, "getData(...)");
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        for (Map.Entry entry2 : concurrentHashMap7.entrySet()) {
                            String str9 = (String) entry2.getKey();
                            if (Intrinsics.a(str9, "level") || Intrinsics.a(str9, "charging")) {
                                linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        linkedHashMap.putAll(linkedHashMap7);
                        str5 = "device.battery";
                    } else {
                        str5 = breadcrumb.k;
                        str = breadcrumb.h;
                        ng1 = breadcrumb.m;
                        ConcurrentHashMap concurrentHashMap8 = breadcrumb.j;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap8, "getData(...)");
                        linkedHashMap.putAll(concurrentHashMap8);
                    }
                    if (str5 != null) {
                        io.sentry.rrweb.a aVar4 = new io.sentry.rrweb.a();
                        aVar4.e = breadcrumb.e().getTime();
                        aVar4.h = breadcrumb.e().getTime() / 1000.0d;
                        aVar4.i = "default";
                        aVar4.j = str5;
                        aVar4.k = str;
                        aVar4.l = ng1;
                        aVar4.m = new ConcurrentHashMap(linkedHashMap);
                        return aVar4;
                    }
                }
                str = null;
                ng1 = null;
                if (str5 != null) {
                    io.sentry.rrweb.a aVar5 = new io.sentry.rrweb.a();
                    aVar5.e = breadcrumb.e().getTime();
                    aVar5.h = breadcrumb.e().getTime() / 1000.0d;
                    aVar5.i = "default";
                    aVar5.j = str5;
                    aVar5.k = str;
                    aVar5.l = ng1;
                    aVar5.m = new ConcurrentHashMap(linkedHashMap);
                    return aVar5;
                }
            }
            str = null;
            ng1 = null;
            if (str5 != null) {
                io.sentry.rrweb.a aVar6 = new io.sentry.rrweb.a();
                aVar6.e = breadcrumb.e().getTime();
                aVar6.h = breadcrumb.e().getTime() / 1000.0d;
                aVar6.i = "default";
                aVar6.j = str5;
                aVar6.k = str;
                aVar6.l = ng1;
                aVar6.m = new ConcurrentHashMap(linkedHashMap);
                return aVar6;
            }
        }
        return null;
    }
}
