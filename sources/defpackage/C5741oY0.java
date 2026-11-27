package defpackage;

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5741oY0 extends ML0 implements Function1<Map<String, ? extends List<? extends String>>, C4220hY0> {
    public final /* synthetic */ C6370rY0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5741oY0(C6370rY0 c6370rY0, String str) {
        super(1);
        this.d = c6370rY0;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C4220hY0 invoke(Map<String, ? extends List<? extends String>> map) {
        String strGroup;
        List<? extends String> list;
        Map<String, ? extends List<? extends String>> headers = map;
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.d.getClass();
        String str = (headers == null || (list = headers.get("content-disposition")) == null) ? null : list.get(0);
        String str2 = "";
        if (str != null) {
            try {
                Matcher matcher = Pattern.compile("attachment; filename(?:\\*=[a-zA-Z0-9_-]+'[\\w_-]*?'|=)([\"']?)(.+)(\\1)", 2).matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(2)) != null) {
                    Intrinsics.checkNotNullExpressionValue(strGroup, "group(2) ?: \"\"");
                    str2 = strGroup;
                }
                String strDecode = URLDecoder.decode(str2, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strDecode, "decode(s, \"UTF-8\")");
                str2 = strDecode;
            } catch (Exception e) {
                C6104qF0.c("Content disposition parsing problem", e);
            }
        }
        int length = str2.length();
        String str3 = this.e;
        return length > 0 ? new C4220hY0(str2, str3, headers.isEmpty(), true) : new C4220hY0((String) null, 9, str3, headers.isEmpty());
    }
}
