package defpackage;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;
import com.pexpress.tool.R;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Hh2 implements Eh2 {

    @NotNull
    public static final Set<String> i = C5487nJ1.b("*");

    @NotNull
    public final Context a;

    @NotNull
    public final InterfaceC7874yh b;

    @NotNull
    public final C2877b7 c;

    @NotNull
    public final C1553Ms d;

    @NotNull
    public final C3700f30 e;

    @NotNull
    public final Set<WebView> f;

    @NotNull
    public final WeakHashMap<WebView, C1310Jo1> g;

    @NotNull
    public final C5959pa2 h;

    @SuppressLint({"ClickableViewAccessibility"})
    public static final class a implements View.OnTouchListener {
        public final int d;

        @NotNull
        public final d e;
        public float g;
        public float h;

        public a(int i, @NotNull d onTap) {
            Intrinsics.checkNotNullParameter(onTap, "onTap");
            this.d = i;
            this.e = onTap;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.g = event.getX();
                this.h = event.getY();
                return false;
            }
            if (actionMasked != 1 || ((float) Math.hypot(event.getX() - this.g, event.getY() - this.h)) > this.d) {
                return false;
            }
            this.e.invoke();
            return false;
        }
    }

    public /* synthetic */ class b extends C2784ak0 implements Function0<Long> {
        public static final b m = new b(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public /* synthetic */ class c extends C2784ak0 implements Function1<String, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            return ((MimeTypeMap) this.e).getExtensionFromMimeType(str);
        }
    }

    public /* synthetic */ class d extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C1310Jo1 c1310Jo1 = (C1310Jo1) this.e;
            synchronized (c1310Jo1) {
                c1310Jo1.a = (Long) e.m.invoke();
            }
            return Unit.a;
        }
    }

    public /* synthetic */ class e extends C2784ak0 implements Function0<Long> {
        public static final e m = new e(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public Hh2(@NotNull Context context, @NotNull InterfaceC7874yh appLinkLauncher, @NotNull InterfaceC6061q30 fileStore, @NotNull C2877b7 scopeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLinkLauncher, "appLinkLauncher");
        Intrinsics.checkNotNullParameter(fileStore, "fileStore");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.a = context;
        this.b = appLinkLauncher;
        this.c = scopeProvider;
        b bVar = b.m;
        this.d = new C1553Ms();
        this.e = new C3700f30(fileStore, Build.VERSION.SDK_INT);
        Set<WebView> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        this.f = setNewSetFromMap;
        this.g = new WeakHashMap<>();
        this.h = new C5959pa2(this);
    }

    @Override // defpackage.Eh2
    public final void a(@NotNull final WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        WeakHashMap<WebView, C1310Jo1> weakHashMap = this.g;
        C1310Jo1 c1310Jo1 = weakHashMap.get(webView);
        if (c1310Jo1 == null) {
            e eVar = e.m;
            c1310Jo1 = new C1310Jo1();
            weakHashMap.put(webView, c1310Jo1);
        }
        final C1310Jo1 c1310Jo2 = c1310Jo1;
        webView.setOnTouchListener(new a(ViewConfiguration.get(webView.getContext()).getScaledTouchSlop(), new d(0, c1310Jo2, C1310Jo1.class, "onTap", "onTap()V", 0)));
        webView.setDownloadListener(new DownloadListener() { // from class: Gh2
            /* JADX WARN: Code duplicated, block: B:113:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
            /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
            /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
            /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
            /* JADX WARN: Code duplicated, block: B:63:0x010d  */
            /* JADX WARN: Code duplicated, block: B:64:0x010f A[Catch: all -> 0x01a8, TryCatch #0 {all -> 0x01a8, blocks: (B:61:0x0100, B:78:0x0160, B:79:0x018b, B:81:0x0195, B:84:0x01aa, B:64:0x010f, B:69:0x012a, B:73:0x0140, B:72:0x0139), top: B:113:0x0100 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x0126  */
            /* JADX WARN: Code duplicated, block: B:67:0x0127  */
            /* JADX WARN: Code duplicated, block: B:69:0x012a A[Catch: all -> 0x01a8, TryCatch #0 {all -> 0x01a8, blocks: (B:61:0x0100, B:78:0x0160, B:79:0x018b, B:81:0x0195, B:84:0x01aa, B:64:0x010f, B:69:0x012a, B:73:0x0140, B:72:0x0139), top: B:113:0x0100 }] */
            /* JADX WARN: Code duplicated, block: B:71:0x0138  */
            /* JADX WARN: Code duplicated, block: B:72:0x0139 A[Catch: all -> 0x01a8, TryCatch #0 {all -> 0x01a8, blocks: (B:61:0x0100, B:78:0x0160, B:79:0x018b, B:81:0x0195, B:84:0x01aa, B:64:0x010f, B:69:0x012a, B:73:0x0140, B:72:0x0139), top: B:113:0x0100 }] */
            /* JADX WARN: Code duplicated, block: B:76:0x015e A[DONT_GENERATE] */
            /* JADX WARN: Code duplicated, block: B:78:0x0160 A[Catch: all -> 0x01a8, TRY_ENTER, TryCatch #0 {all -> 0x01a8, blocks: (B:61:0x0100, B:78:0x0160, B:79:0x018b, B:81:0x0195, B:84:0x01aa, B:64:0x010f, B:69:0x012a, B:73:0x0140, B:72:0x0139), top: B:113:0x0100 }] */
            /* JADX WARN: Code duplicated, block: B:81:0x0195 A[Catch: all -> 0x01a8, LOOP:0: B:79:0x018b->B:81:0x0195, LOOP_END, TryCatch #0 {all -> 0x01a8, blocks: (B:61:0x0100, B:78:0x0160, B:79:0x018b, B:81:0x0195, B:84:0x01aa, B:64:0x010f, B:69:0x012a, B:73:0x0140, B:72:0x0139), top: B:113:0x0100 }] */
            /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:92:0x01d2  */
            /* JADX WARN: Code duplicated, block: B:94:0x0226  */
            /* JADX WARN: Code duplicated, block: B:96:0x022e  */
            /* JADX WARN: Code duplicated, block: B:98:0x0242  */
            /* JADX WARN: Instruction removed from duplicated block: B:92:0x01d2, please report this as an issue */
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String dataUrl, String str, String str2, String str3, long j) {
                String token;
                boolean z;
                String str4;
                Object obj;
                C1553Ms c1553Ms;
                String strSubstring;
                int iG;
                Integer numValueOf;
                int iF;
                String str5;
                InterfaceC7874yh interfaceC7874yh;
                C7664xh c7664xh;
                Context context;
                C1310Jo1 c1310Jo3 = c1310Jo2;
                final Hh2 hh2 = this;
                WebView webView2 = webView;
                synchronized (c1310Jo3) {
                    Long l = c1310Jo3.a;
                    token = null;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        c1310Jo3.a = null;
                        z = ((Number) Hh2.e.m.invoke()).longValue() - jLongValue <= 5000;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    Set<String> set = C6620si2.a;
                    Intrinsics.checkNotNull(dataUrl);
                    C6620si2.b(dataUrl);
                    return;
                }
                Intrinsics.checkNotNull(dataUrl);
                hh2.getClass();
                Intrinsics.checkNotNullParameter(dataUrl, "url");
                Set<String> set2 = C6620si2.a;
                Intrinsics.checkNotNullParameter(dataUrl, "url");
                if (!CollectionsKt.z(C6620si2.a, C6620si2.b(dataUrl))) {
                    String strA = str2 != null ? C4120h30.a(str2) : null;
                    String strB = C6620si2.b(dataUrl);
                    if (Intrinsics.a(strB, "data")) {
                        if (C3686f.m(StringsKt.d0(StringsKt.X(StringsKt.X(StringsKt.U(':', dataUrl, dataUrl), ','), ';')).toString(), strA)) {
                            obj = C4330i30.a;
                        } else {
                            Intrinsics.checkNotNullParameter(dataUrl, "dataUrl");
                            obj = dataUrl.length() > 27963048 ? C5221m30.a : C4588j30.a;
                        }
                    } else if (Intrinsics.a(strB, "blob")) {
                        str4 = str3;
                        obj = C3686f.m(str4, strA) ? C4330i30.a : C5008l30.a;
                    } else {
                        str4 = str3;
                        obj = C5431n30.a;
                    }
                    C6620si2.b(dataUrl);
                    Objects.toString(obj);
                    if (Intrinsics.a(obj, C4798k30.a)) {
                        interfaceC7874yh = hh2.b;
                        c7664xh = interfaceC7874yh.parse(dataUrl);
                        if (c7664xh != null) {
                            context = hh2.a;
                            if (!interfaceC7874yh.a(context, c7664xh) && interfaceC7874yh.c(context, c7664xh)) {
                                return;
                            }
                        }
                        hh2.c(InterfaceC5947pX.a.a);
                        return;
                    }
                    if (Intrinsics.a(obj, C5008l30.a)) {
                        if (Intrinsics.a(obj, C4588j30.a)) {
                            C5189lv.k(hh2.c.a, null, new Ih2(hh2, dataUrl, str3, str2, null), 3);
                            return;
                        } else {
                            if (Intrinsics.a(obj, C4330i30.a) && !Intrinsics.a(obj, C5221m30.a) && !Intrinsics.a(obj, C5431n30.a)) {
                                throw new C6489s51();
                            }
                            hh2.c(InterfaceC5947pX.a.a);
                            return;
                        }
                    }
                    if (hh2.f.contains(webView2)) {
                        c1553Ms = hh2.d;
                        synchronized (c1553Ms) {
                            try {
                                Intrinsics.checkNotNullParameter(dataUrl, "blobUrl");
                                if (d.o(dataUrl, "blob:", true)) {
                                    strSubstring = dataUrl.substring(5);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                    iG = StringsKt.G(strSubstring, "://", 0, false, 6);
                                    numValueOf = Integer.valueOf(iG);
                                    if (iG > 0) {
                                        numValueOf = null;
                                    }
                                    if (numValueOf != null) {
                                        iF = StringsKt.F('/', numValueOf.intValue() + 3, 4, strSubstring);
                                        if (iF < 0) {
                                            strSubstring = strSubstring.substring(0, iF);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        }
                                        String lowerCase = StringsKt.e0(StringsKt.d0(strSubstring).toString(), '/').toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                        str5 = lowerCase;
                                    } else {
                                        str5 = null;
                                    }
                                } else {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    final long jLongValue2 = ((Number) Hh2.b.m.invoke()).longValue();
                                    Collection<C1553Ms.a> collectionValues = c1553Ms.a.values();
                                    Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                                    Collection<C1553Ms.a> collection = collectionValues;
                                    Function1 predicate = new Function1() { // from class: Ls
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            C1553Ms.a it = (C1553Ms.a) obj2;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            return Boolean.valueOf(jLongValue2 - it.d > 60000);
                                        }
                                    };
                                    Intrinsics.checkNotNullParameter(collection, "<this>");
                                    Intrinsics.checkNotNullParameter(predicate, "predicate");
                                    C2904bF.q(collection, predicate, true);
                                    while (c1553Ms.a.size() >= 8) {
                                        LinkedHashMap<String, C1553Ms.a> linkedHashMap = c1553Ms.a;
                                        Set<String> setKeySet = linkedHashMap.keySet();
                                        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                                        linkedHashMap.remove(CollectionsKt.E(setKeySet));
                                    }
                                    String string = UUID.randomUUID().toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    c1553Ms.a.put(string, new C1553Ms.a(dataUrl, str4, str2, str5, jLongValue2));
                                    token = string;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (token == null) {
                        hh2.c(InterfaceC5947pX.a.a);
                        return;
                    }
                    Intrinsics.checkNotNullParameter(token, "token");
                    Intrinsics.checkNotNullParameter(dataUrl, "blobUrl");
                    webView2.evaluateJavascript(DS1.b("\n            (function(token, blobUrl, maxBytes) {\n              var replies = window.__appDownloads;\n              if (!replies) return false;\n              function lookup(w, key) {\n                try {\n                  var map = w[key];\n                  if (map && map.has(blobUrl)) return map.get(blobUrl);\n                } catch (e) {}\n                for (var i = 0; i < w.frames.length; i++) {\n                  var found = lookup(w.frames[i], key);\n                  if (found) return found;\n                }\n                return null;\n              }\n              function reply(message) {\n                message.t = token;\n                replies.postMessage(JSON.stringify(message));\n              }\n              var blob = lookup(window, '__appBlobs');\n              var name = lookup(window, '__appDownloadNames') || '';\n              var source = blob ? Promise.resolve(blob)\n                : fetch(blobUrl).then(function(response) { return response.blob(); });\n              source\n                .then(function(b) {\n                  if (b.size > maxBytes) throw new Error('too large: ' + b.size);\n                  return new Promise(function(resolve, reject) {\n                    var reader = new FileReader();\n                    reader.onload = function() { resolve(reader.result); };\n                    reader.onerror = function() { reject(reader.error); };\n                    reader.readAsDataURL(b);\n                  });\n                })\n                .then(function(dataUrl) {\n                  reply({ d: dataUrl, n: name });\n                }, function(error) {\n                  reply({ e: String(error) });\n                });\n              return true;\n            })(" + CollectionsKt.J(WE.f(JSONObject.quote(token), JSONObject.quote(dataUrl), 20971520), null, null, null, null, 63) + ");\n        "), new ValueCallback() { // from class: Fh2
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            if (Intrinsics.a((String) obj2, "true")) {
                                return;
                            }
                            hh2.c(InterfaceC5947pX.a.a);
                        }
                    });
                }
                obj = C4798k30.a;
                str4 = str3;
                C6620si2.b(dataUrl);
                Objects.toString(obj);
                if (Intrinsics.a(obj, C4798k30.a)) {
                    interfaceC7874yh = hh2.b;
                    c7664xh = interfaceC7874yh.parse(dataUrl);
                    if (c7664xh != null) {
                        context = hh2.a;
                        if (!interfaceC7874yh.a(context, c7664xh)) {
                            return;
                        }
                    }
                    hh2.c(InterfaceC5947pX.a.a);
                    return;
                }
                if (Intrinsics.a(obj, C5008l30.a)) {
                    if (Intrinsics.a(obj, C4588j30.a)) {
                        C5189lv.k(hh2.c.a, null, new Ih2(hh2, dataUrl, str3, str2, null), 3);
                        return;
                    } else {
                        if (Intrinsics.a(obj, C4330i30.a)) {
                        }
                        hh2.c(InterfaceC5947pX.a.a);
                        return;
                    }
                }
                if (hh2.f.contains(webView2)) {
                    c1553Ms = hh2.d;
                    synchronized (c1553Ms) {
                        Intrinsics.checkNotNullParameter(dataUrl, "blobUrl");
                        if (d.o(dataUrl, "blob:", true)) {
                            str5 = null;
                        } else {
                            strSubstring = dataUrl.substring(5);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            iG = StringsKt.G(strSubstring, "://", 0, false, 6);
                            numValueOf = Integer.valueOf(iG);
                            if (iG > 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                iF = StringsKt.F('/', numValueOf.intValue() + 3, 4, strSubstring);
                                if (iF < 0) {
                                    strSubstring = strSubstring.substring(0, iF);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                }
                                String lowerCase2 = StringsKt.e0(StringsKt.d0(strSubstring).toString(), '/').toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                str5 = lowerCase2;
                            } else {
                                str5 = null;
                            }
                        }
                        if (str5 == null) {
                            final long jLongValue3 = ((Number) Hh2.b.m.invoke()).longValue();
                            Collection<C1553Ms.a> collectionValues2 = c1553Ms.a.values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
                            Collection<C1553Ms.a> collection2 = collectionValues2;
                            Function1 predicate2 = new Function1() { // from class: Ls
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    C1553Ms.a it = (C1553Ms.a) obj2;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return Boolean.valueOf(jLongValue3 - it.d > 60000);
                                }
                            };
                            Intrinsics.checkNotNullParameter(collection2, "<this>");
                            Intrinsics.checkNotNullParameter(predicate2, "predicate");
                            C2904bF.q(collection2, predicate2, true);
                            while (c1553Ms.a.size() >= 8) {
                                LinkedHashMap<String, C1553Ms.a> linkedHashMap2 = c1553Ms.a;
                                Set<String> setKeySet2 = linkedHashMap2.keySet();
                                Intrinsics.checkNotNullExpressionValue(setKeySet2, "<get-keys>(...)");
                                linkedHashMap2.remove(CollectionsKt.E(setKeySet2));
                            }
                            String string2 = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            c1553Ms.a.put(string2, new C1553Ms.a(dataUrl, str4, str2, str5, jLongValue3));
                            token = string2;
                        }
                    }
                }
                if (token == null) {
                    hh2.c(InterfaceC5947pX.a.a);
                    return;
                }
                Intrinsics.checkNotNullParameter(token, "token");
                Intrinsics.checkNotNullParameter(dataUrl, "blobUrl");
                webView2.evaluateJavascript(DS1.b("\n            (function(token, blobUrl, maxBytes) {\n              var replies = window.__appDownloads;\n              if (!replies) return false;\n              function lookup(w, key) {\n                try {\n                  var map = w[key];\n                  if (map && map.has(blobUrl)) return map.get(blobUrl);\n                } catch (e) {}\n                for (var i = 0; i < w.frames.length; i++) {\n                  var found = lookup(w.frames[i], key);\n                  if (found) return found;\n                }\n                return null;\n              }\n              function reply(message) {\n                message.t = token;\n                replies.postMessage(JSON.stringify(message));\n              }\n              var blob = lookup(window, '__appBlobs');\n              var name = lookup(window, '__appDownloadNames') || '';\n              var source = blob ? Promise.resolve(blob)\n                : fetch(blobUrl).then(function(response) { return response.blob(); });\n              source\n                .then(function(b) {\n                  if (b.size > maxBytes) throw new Error('too large: ' + b.size);\n                  return new Promise(function(resolve, reject) {\n                    var reader = new FileReader();\n                    reader.onload = function() { resolve(reader.result); };\n                    reader.onerror = function() { reject(reader.error); };\n                    reader.readAsDataURL(b);\n                  });\n                })\n                .then(function(dataUrl) {\n                  reply({ d: dataUrl, n: name });\n                }, function(error) {\n                  reply({ e: String(error) });\n                });\n              return true;\n            })(" + CollectionsKt.J(WE.f(JSONObject.quote(token), JSONObject.quote(dataUrl), 20971520), null, null, null, null, 63) + ");\n        "), new ValueCallback() { // from class: Fh2
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        if (Intrinsics.a((String) obj2, "true")) {
                            return;
                        }
                        hh2.c(InterfaceC5947pX.a.a);
                    }
                });
            }
        });
        if (C3057c.j("WEB_MESSAGE_LISTENER") && C3057c.j("DOCUMENT_START_SCRIPT") && this.f.add(webView)) {
            int i2 = Bh2.a;
            if (!Mh2.c.d()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            InterfaceC5361mi2 interfaceC5361mi2 = Zh2.a.a;
            WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceCreateWebView = interfaceC5361mi2.createWebView(webView);
            Set<String> set = i;
            webViewProviderBoundaryInterfaceCreateWebView.addWebMessageListener("__appDownloads", (String[]) set.toArray(new String[0]), new C8129zu.a(new Nf2(this.h)));
            if (!Mh2.d.d()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    /* JADX WARN: Code duplicated, block: B:68:0x0176 A[PHI: r9
      0x0176: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v10 java.lang.String) binds: [B:59:0x014d, B:64:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    public final InterfaceC5947pX b(String url, String str, String str2, String str3) throws IOException {
        int iF;
        boolean z;
        C4204hT c4204hT;
        String strB;
        String strC;
        String strA;
        String string;
        Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.text.d.o(url, "data:", true) && (iF = StringsKt.F(',', 0, 6, url)) >= 0) {
            String strSubstring = url.substring(5, iF);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            List listR = StringsKt.R(strSubstring, new char[]{';'});
            ArrayList arrayList = new ArrayList(XE.m(listR, 10));
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.d0((String) it.next()).toString());
            }
            List listA = CollectionsKt.A(arrayList, 1);
            if (listA != null && listA.isEmpty()) {
                z = false;
                break;
            }
            Iterator it2 = listA.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (kotlin.text.d.i((String) it2.next(), "base64")) {
                    z = true;
                    break;
                }
            }
            String strSubstring2 = url.substring(iF + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            byte[] bArrM = C3057c.m(strSubstring2);
            if (bArrM != null) {
                if (z) {
                    String str4 = new String(bArrM, Charsets.b);
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < str4.length(); i2++) {
                        char cCharAt = str4.charAt(i2);
                        if (!CharsKt.c(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    try {
                        Base64 base64 = Base64.d;
                        Base64.PaddingOption option = Base64.PaddingOption.g;
                        base64.getClass();
                        Intrinsics.checkNotNullParameter(option, "option");
                        if (base64.c != option) {
                            base64 = new Base64(base64.a, base64.b, option);
                        }
                        bArrM = Base64.a(base64, string2);
                    } catch (IllegalArgumentException unused) {
                        bArrM = null;
                    }
                    if (bArrM == null) {
                        c4204hT = null;
                    }
                }
                CharSequence string3 = (CharSequence) CollectionsKt.F(arrayList);
                if (string3.length() == 0) {
                    string3 = str != null ? StringsKt.d0(str).toString() : null;
                    if (string3 == null) {
                        string3 = "";
                    }
                }
                CharSequence charSequence = string3;
                if (charSequence.length() == 0) {
                    charSequence = "application/octet-stream";
                }
                String lowerCase = ((String) charSequence).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                c4204hT = new C4204hT(lowerCase, bArrM);
            } else {
                c4204hT = null;
            }
        } else {
            c4204hT = null;
        }
        if (c4204hT == null) {
            return InterfaceC5947pX.a.a;
        }
        Regex regex = C4120h30.a;
        c extensionOf = new c(1, MimeTypeMap.getSingleton(), MimeTypeMap.class, "getExtensionFromMimeType", "getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String mimeType = c4204hT.a;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(extensionOf, "extensionOf");
        String str5 = (String) extensionOf.invoke(mimeType);
        String strB2 = C4120h30.b(str3);
        if (strB2 != null) {
            if (!StringsKt.D(strB2, JwtParser.SEPARATOR_CHAR) || str5 == null) {
                strB = strB2;
            } else {
                strB = C2629a1.b(strB2, ".", str5);
            }
            if (strB.length() <= 100) {
                strC = strB;
            } else {
                String strB3 = KS1.B(50, StringsKt.W(JwtParser.SEPARATOR_CHAR, strB, ""));
                String strConcat = strB3.length() != 0 ? ".".concat(strB3) : "";
                strC = Z0.c(KS1.B(100 - strConcat.length(), StringsKt.a0(strB, JwtParser.SEPARATOR_CHAR)), strConcat);
            }
        } else {
            strB2 = C4120h30.b(str2 != null ? C4120h30.a(str2) : null);
            if (strB2 == null) {
                if (str5 == null) {
                    str5 = "bin";
                }
                strC = "download_" + jCurrentTimeMillis + "." + str5;
            } else {
                if (StringsKt.D(strB2, JwtParser.SEPARATOR_CHAR)) {
                    strB = strB2;
                } else {
                    strB = strB2;
                }
                if (strB.length() <= 100) {
                    strC = strB;
                } else {
                    String strB4 = KS1.B(50, StringsKt.W(JwtParser.SEPARATOR_CHAR, strB, ""));
                    if (strB4.length() != 0) {
                    }
                    strC = Z0.c(KS1.B(100 - strConcat.length(), StringsKt.a0(strB, JwtParser.SEPARATOR_CHAR)), strConcat);
                }
            }
        }
        byte[] bytes = c4204hT.b;
        C5851p30 file = new C5851p30(bytes, strC, mimeType);
        C3700f30 c3700f30 = this.e;
        c3700f30.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        if (kotlin.text.d.i(mimeType != null ? StringsKt.d0(mimeType).toString() : null, "application/vnd.android.package-archive") || !(strC == null || (string = StringsKt.d0(strC).toString()) == null || !kotlin.text.d.h(string, ".apk", true))) {
            return InterfaceC5947pX.a.a;
        }
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length > 20971520) {
            return InterfaceC5947pX.a.a;
        }
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        EnumC5490nK1 enumC5490nK1 = c3700f30.b >= 29 ? kotlin.text.d.o(mimeType, "image/", false) ? EnumC5490nK1.d : EnumC5490nK1.e : null;
        InterfaceC6061q30 interfaceC6061q30 = c3700f30.a;
        if (enumC5490nK1 != null && (strA = interfaceC6061q30.a(file, enumC5490nK1)) != null) {
            return new InterfaceC5947pX.b(strA);
        }
        Uri uriB = interfaceC6061q30.b(file);
        return uriB != null ? new InterfaceC5947pX.c(uriB, mimeType) : InterfaceC5947pX.a.a;
    }

    public final void c(InterfaceC5947pX interfaceC5947pX) {
        interfaceC5947pX.getClass();
        boolean z = interfaceC5947pX instanceof InterfaceC5947pX.b;
        Context context = this.a;
        if (z) {
            String string = context.getString(R.string.webview_download_saved_text, ((InterfaceC5947pX.b) interfaceC5947pX).a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Toast.makeText(context, string, 1).show();
            return;
        }
        if (!(interfaceC5947pX instanceof InterfaceC5947pX.c)) {
            if (!interfaceC5947pX.equals(InterfaceC5947pX.a.a)) {
                throw new C6489s51();
            }
            String string2 = context.getString(R.string.an_error_occured_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Toast.makeText(context, string2, 1).show();
            return;
        }
        InterfaceC5947pX.c cVar = (InterfaceC5947pX.c) interfaceC5947pX;
        Intent type = new Intent("android.intent.action.SEND").setType(cVar.b);
        Uri uri = cVar.a;
        Intent intentAddFlags = type.putExtra("android.intent.extra.STREAM", uri).addFlags(1);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        intentAddFlags.setClipData(ClipData.newRawUri(null, uri));
        try {
            context.startActivity(Intent.createChooser(intentAddFlags, null));
        } catch (RuntimeException e2) {
            b0.e("WebViewDownloads", "share failed: ".concat(e2.getClass().getSimpleName()));
            String string3 = context.getString(R.string.an_error_occured_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            Toast.makeText(context, string3, 1).show();
        }
    }
}
