package defpackage;

import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Jo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1309Jo0 extends ML0 implements Function1<C2013So0, C2013So0> {
    public final /* synthetic */ C1465Lo0 d;
    public final /* synthetic */ C0997Fo0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309Jo0(C1465Lo0 c1465Lo0, C0997Fo0 c0997Fo0) {
        super(1);
        this.d = c1465Lo0;
        this.e = c0997Fo0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    @Override // kotlin.jvm.functions.Function1
    public final C2013So0 invoke(C2013So0 c2013So0) {
        C0997Fo0 c0997Fo0A;
        C2013So0 state = c2013So0;
        Intrinsics.checkNotNullParameter(state, "state");
        C1465Lo0 c1465Lo0 = this.d;
        TreeMap treeMap = c1465Lo0.h;
        C0997Fo0 message = this.e;
        Long lValueOf = Long.valueOf(message.f);
        KW1 kw1 = TW0.a;
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.a(message.b, "text/plain")) {
            Object value = TW0.a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-imagePattern>(...)");
            C6367rX0 match = Regex.b(new Regex((Pattern) value), message.d);
            if (match != null) {
                Intrinsics.checkNotNullParameter(match, "match");
                String str = (String) ((C6367rX0.a) match.a()).get(2);
                if (StringsKt.I(str)) {
                    c0997Fo0A = message;
                } else {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                    if (mimeTypeFromExtension == null || StringsKt.I(mimeTypeFromExtension)) {
                        c0997Fo0A = message;
                    } else {
                        c0997Fo0A = C0997Fo0.a(message, null, mimeTypeFromExtension, str, null, 21);
                    }
                }
            } else {
                c0997Fo0A = message;
            }
        } else {
            c0997Fo0A = message;
        }
        treeMap.put(lValueOf, c0997Fo0A);
        Set setEntrySet = c1465Lo0.h.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "messagesCache.entries");
        ArrayList arrayList = new ArrayList(XE.m(setEntrySet, 10));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "it.value");
            C0997Fo0 c0997Fo0 = (C0997Fo0) value2;
            EK1 ek1 = c1465Lo0.f;
            ek1.getClass();
            arrayList.add(C0997Fo0.a(c0997Fo0, null, null, null, message.f <= ((Number) ek1.o.a(EK1.z[16], ek1)).longValue() ? TZ0.a.a : TZ0.d.a, 15));
        }
        return C2013So0.a(state, arrayList, false, 0L, 6);
    }
}
