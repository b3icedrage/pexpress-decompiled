package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.media.MediaSignResponse;
import com.jivosite.sdk.model.pojo.response.Response;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7841yY0 {

    @NotNull
    public final EY0<C3457dt1<String>> a;

    /* JADX INFO: renamed from: yY0$a */
    public static final class a {

        @NotNull
        public final InterfaceC5889pD1 a;

        @Nullable
        public C3598ea2 b;

        @Nullable
        public C7113v4 c;

        @Nullable
        public C3808fa2 d;

        public a(@NotNull InterfaceC5889pD1 schedulers) {
            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
            this.a = schedulers;
        }
    }

    public AbstractC7841yY0(@NotNull final InterfaceC5889pD1 schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.a = new EY0<>();
        schedulers.b().execute(new Runnable() { // from class: sY0
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC7841yY0 this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                final InterfaceC5889pD1 schedulers2 = schedulers;
                Intrinsics.checkNotNullParameter(schedulers2, "$schedulers");
                this$0.d(new C3457dt1<>(0, null, null, null, 31));
                final LiveData<C4705jd<MediaSignResponse>> liveDataB = this$0.b();
                this$0.a.l(liveDataB, new InterfaceC4819k81() { // from class: tY0
                    @Override // defpackage.InterfaceC4819k81
                    public final void d(Object obj) {
                        final AbstractC7841yY0 this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        LiveData accessSource = liveDataB;
                        Intrinsics.checkNotNullParameter(accessSource, "$accessSource");
                        final InterfaceC5889pD1 schedulers3 = schedulers2;
                        Intrinsics.checkNotNullParameter(schedulers3, "$schedulers");
                        this$1.a.m(accessSource);
                        final C4705jd c4705jdC = this$1.c((C4705jd) obj);
                        if (c4705jdC != null) {
                            schedulers3.c().execute(new Runnable() { // from class: uY0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final AbstractC7841yY0 this$2 = this$1;
                                    Intrinsics.checkNotNullParameter(this$2, "this$0");
                                    C4705jd apiResponse = c4705jdC;
                                    Intrinsics.checkNotNullParameter(apiResponse, "$apiResponse");
                                    InterfaceC5889pD1 schedulers4 = schedulers3;
                                    Intrinsics.checkNotNullParameter(schedulers4, "$schedulers");
                                    C1351Kc0 c1351Kc0A = this$2.a();
                                    InputStream inputStream = c1351Kc0A.e;
                                    if (inputStream == null) {
                                        this$2.a.i(new C3457dt1<>(2, null, null, new C6313rF0(OW0.b(new Pair("can_not_read", ""))), 6));
                                        return;
                                    }
                                    Pattern pattern = CY0.d;
                                    CY0 cy0A = CY0.a.a(c1351Kc0A.d);
                                    Intrinsics.checkNotNullParameter(inputStream, "<this>");
                                    final C3140cO c3140cO = new C3140cO(new C5605ns1(cy0A, inputStream), new C3327dG0(this$2, 1));
                                    Object obj2 = apiResponse.b;
                                    Intrinsics.c(obj2, "null cannot be cast to non-null type com.jivosite.sdk.model.pojo.media.MediaSignResponse");
                                    MediaSignResponse mediaSignResponse = (MediaSignResponse) obj2;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(mediaSignResponse.e);
                                    sb.append('/');
                                    sb.append(c1351Kc0A.a);
                                    sb.append("?ts=");
                                    sb.append(mediaSignResponse.d);
                                    sb.append("&sign=");
                                    final String strB = C5807oq.b(sb, mediaSignResponse.c, "&public");
                                    C7148vD1.a aVarB = schedulers4.b();
                                    final String str = mediaSignResponse.f;
                                    final String str2 = mediaSignResponse.e;
                                    aVarB.execute(new Runnable() { // from class: vY0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final AbstractC7841yY0 this$3 = this$2;
                                            Intrinsics.checkNotNullParameter(this$3, "this$0");
                                            String url = strB;
                                            Intrinsics.checkNotNullParameter(url, "$url");
                                            C3140cO body = c3140cO;
                                            Intrinsics.checkNotNullParameter(body, "$body");
                                            final LiveData<C4705jd<Void>> liveDataE = this$3.e(str, url, body);
                                            EY0<C3457dt1<String>> ey0 = this$3.a;
                                            final String str3 = str2;
                                            ey0.l(liveDataE, new InterfaceC4819k81() { // from class: wY0
                                                @Override // defpackage.InterfaceC4819k81
                                                public final void d(Object obj3) {
                                                    List list;
                                                    String str4;
                                                    AbstractC7841yY0 this$4 = this$3;
                                                    Intrinsics.checkNotNullParameter(this$4, "this$0");
                                                    LiveData uploadSource = liveDataE;
                                                    Intrinsics.checkNotNullParameter(uploadSource, "$uploadSource");
                                                    this$4.a.m(uploadSource);
                                                    C4705jd c4705jdC2 = this$4.c((C4705jd) obj3);
                                                    if (c4705jdC2 != null) {
                                                        TreeMap treeMap = c4705jdC2.c;
                                                        this$4.d((treeMap == null || (list = (List) treeMap.get("Location")) == null || (str4 = (String) list.get(0)) == null) ? new C3457dt1<>(2, null, null, new C6313rF0(OW0.b(new Pair("empty_headers", ""))), 6) : new C3457dt1<>(1, null, C5807oq.b(new StringBuilder(), str3, str4), null, 26));
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    @NotNull
    public abstract C1351Kc0 a();

    @NotNull
    public abstract LiveData<C4705jd<MediaSignResponse>> b();

    public final <T> C4705jd<T> c(C4705jd<T> c4705jd) {
        if (c4705jd == null) {
            C6104qF0.b("There is something wrong in UploadResource");
            d(new C3457dt1<>(2, null, null, null, 6));
            return null;
        }
        int i = c4705jd.a;
        if (200 > i || i >= 300) {
            Throwable th = c4705jd.d;
            if (th != null) {
                th.getLocalizedMessage();
            }
            d(new C3457dt1<>(2, null, null, th, 6));
            return null;
        }
        T t = c4705jd.b;
        if (t != null) {
            if (!(t instanceof Response)) {
                d(new C3457dt1<>(2, null, null, new C6313rF0(OW0.b(new Pair("wrong_body_class", ""))), 6));
                return null;
            }
            Response response = (Response) t;
            if (!response.getG()) {
                HashMap map = new HashMap();
                List<String> listA = response.a();
                if (listA != null) {
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        map.put((String) it.next(), "");
                    }
                }
                C6313rF0 c6313rF0 = new C6313rF0(map);
                c6313rF0.getLocalizedMessage();
                d(new C3457dt1<>(2, null, null, c6313rF0, 6));
                return null;
            }
        }
        return c4705jd;
    }

    public final void d(C3457dt1<String> c3457dt1) {
        EY0<C3457dt1<String>> ey0 = this.a;
        if (Intrinsics.a(ey0.d(), c3457dt1)) {
            return;
        }
        ey0.k(c3457dt1);
    }

    @NotNull
    public abstract LiveData<C4705jd<Void>> e(@Nullable String str, @NotNull String str2, @NotNull AbstractC5395ms1 abstractC5395ms1);
}
