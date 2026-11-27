package com.impl.core.backend.abstractModels.http;

import defpackage.C5653o60;
import defpackage.EnumC4537iq1;
import defpackage.InterfaceC2691aI1;
import defpackage.KS1;
import defpackage.VE;
import defpackage.WE;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/impl/core/backend/abstractModels/http/HttpPlatformResponse;", "", "", "success", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "error", "Ljava/lang/Object;", "getError", "()Ljava/lang/Object;", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HttpPlatformResponse {

    @Deprecated
    public static final int MAX_MESSAGE_LENGTH = 200;

    @InterfaceC2691aI1("error")
    @Nullable
    private final Object error;

    @InterfaceC2691aI1("status")
    @Nullable
    private final Boolean success;

    @NotNull
    private static final Companion Companion = new Companion();

    @NotNull
    private static final List<String> PRIORITY_FIELDS = WE.f(PlatformHttpError.FIELD_CAPTCHA_REBUS, PlatformHttpError.FIELD_CAPTCHA_TOKEN, "email");

    @NotNull
    private static final Regex HTML_LINE_BREAK = new Regex("<br\\s*/?>|</p>", EnumC4537iq1.IGNORE_CASE);

    @NotNull
    private static final Regex HTML_TAG = new Regex("<[^>]*>");

    @NotNull
    private static final Regex WHITESPACE = new Regex("\\s+");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/impl/core/backend/abstractModels/http/HttpPlatformResponse$Companion;", "", "<init>", "()V", "", "MAX_MESSAGE_LENGTH", "I", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public HttpPlatformResponse() {
        this(0);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    @NotNull
    public final PlatformHttpError c() {
        Iterable<Pair> iterableG;
        Pair pair;
        PlatformHttpError platformHttpError;
        PlatformErrorCodes next;
        Object obj = this.error;
        if (obj instanceof String) {
            iterableG = VE.c(new Pair(null, obj));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            List<String> list = PRIORITY_FIELDS;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Object obj2 = map.get(str);
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                Pair pair2 = str2 != null ? new Pair(str, str2) : null;
                if (pair2 != null) {
                    arrayList.add(pair2);
                }
            }
            Set<Map.Entry> setEntrySet = map.entrySet();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str3 = key instanceof String ? (String) key : null;
                if (str3 == null || PRIORITY_FIELDS.contains(str3)) {
                    pair = null;
                } else {
                    String str4 = value instanceof String ? (String) value : null;
                    if (str4 != null) {
                        pair = new Pair(str3, str4);
                    } else {
                        pair = null;
                    }
                }
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            iterableG = CollectionsKt.Q(arrayList, arrayList2);
        } else if (obj instanceof Iterable) {
            Object objG = CollectionsKt.G((Iterable) obj);
            String str5 = objG instanceof String ? (String) objG : null;
            iterableG = WE.g(str5 != null ? new Pair(null, str5) : null);
        } else {
            iterableG = C5653o60.d;
        }
        ArrayList arrayList3 = new ArrayList(XE.m(iterableG, 10));
        for (Pair pair3 : iterableG) {
            arrayList3.add(new Pair((String) pair3.d, StringsKt.d0(WHITESPACE.replace(HTML_TAG.replace(HTML_LINE_BREAK.replace((String) pair3.e, " "), ""), " ")).toString()));
        }
        Iterator it = arrayList3.iterator();
        do {
            if (!it.hasNext()) {
                platformHttpError = null;
                break;
            }
            Pair pair4 = (Pair) it.next();
            String str6 = (String) pair4.d;
            String str7 = (String) pair4.e;
            Iterator<PlatformErrorCodes> it2 = PlatformErrorCodes.e().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!StringsKt.C(str7, next.getCode(), true));
            PlatformErrorCodes platformErrorCodes = next;
            String code = platformErrorCodes != null ? platformErrorCodes.getCode() : null;
            platformHttpError = code != null ? new PlatformHttpError(code, KS1.B(MAX_MESSAGE_LENGTH, StringsKt.d0(str7).toString()), str6) : null;
        } while (platformHttpError == null);
        if (platformHttpError != null) {
            return platformHttpError;
        }
        Pair pair5 = (Pair) CollectionsKt.firstOrNull(arrayList3);
        PlatformHttpError platformHttpError2 = pair5 != null ? new PlatformHttpError(null, KS1.B(MAX_MESSAGE_LENGTH, StringsKt.d0((String) pair5.e).toString()), (String) pair5.d) : null;
        return platformHttpError2 == null ? new PlatformHttpError(null, null, null) : platformHttpError2;
    }

    public HttpPlatformResponse(int i) {
        this.success = null;
        this.error = null;
    }
}
