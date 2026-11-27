package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SF0 extends Qd2 {

    @NotNull
    public final EY0 A;

    @NotNull
    public final W11<String> B;

    @NotNull
    public final EY0 C;

    @NotNull
    public final EY0 D;

    @NotNull
    public final EY0 E;

    @NotNull
    public final EY0 F;

    @NotNull
    public final W11<Z70<AbstractC7547x70>> G;

    @NotNull
    public final EY0 H;

    @NotNull
    public final EY0 I;

    @NotNull
    public final M8 d;

    @NotNull
    public final InterfaceC5570ni1 e;

    @NotNull
    public final InterfaceC4855kK f;

    @NotNull
    public final InterfaceC3940gB g;

    @NotNull
    public final InterfaceC1153Ho0 h;

    @NotNull
    public final InterfaceC7011ub1 i;

    @NotNull
    public final AF1 j;

    @NotNull
    public final InterfaceC7759y72 k;

    @NotNull
    public final R42 l;

    @NotNull
    public final InterfaceC7195vT0 m;

    @NotNull
    public final InterfaceC3389da2 n;

    @NotNull
    public final EK1 o;

    @NotNull
    public final C6102qE1 p;

    @NotNull
    public final InterfaceC3190cd1 q;

    @NotNull
    public final InterfaceC7170vL r;

    @NotNull
    public final J92 s;

    @NotNull
    public final InterfaceC0836Dm1 t;

    @NotNull
    public final Handler u;

    @NotNull
    public final CF0 v;

    @NotNull
    public final DF0 w;

    @NotNull
    public final EY0<c> x;

    @NotNull
    public final EY0 y;

    @NotNull
    public final C2901bE<String> z;

    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a() {
            this(false, false, false);
        }

        public static a a(a aVar, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.b;
            }
            if ((i & 4) != 0) {
                z3 = aVar.c;
            }
            return new a(z, z2, z3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = r1 * 31;
            boolean z2 = this.b;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.c;
            return i2 + (z3 ? 1 : z3);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CanAttachState(isLoading=");
            sb.append(this.a);
            sb.append(", hasConnection=");
            sb.append(this.b);
            sb.append(", hasPendingMessage=");
            return C4564j.f(sb, this.c, ')');
        }

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b() {
            this(false, false, false);
        }

        public static b a(b bVar, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                z = bVar.a;
            }
            if ((i & 2) != 0) {
                z2 = bVar.b;
            }
            if ((i & 4) != 0) {
                z3 = bVar.c;
            }
            return new b(z, z2, z3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = r1 * 31;
            boolean z2 = this.b;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.c;
            return i2 + (z3 ? 1 : z3);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CanSendState(hasMessage=");
            sb.append(this.a);
            sb.append(", hasConnection=");
            sb.append(this.b);
            sb.append(", hasPendingMessage=");
            return C4564j.f(sb, this.c, ')');
        }

        public b(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static final class c {

        @NotNull
        public final String a;
        public final boolean b;
        public final boolean c;

        @NotNull
        public final C2013So0 d;

        @NotNull
        public final HF1 e;

        @NotNull
        public final List<AbstractC5723oS0.c> f;

        @NotNull
        public final C3179ca2 g;

        @NotNull
        public final C4449id1 h;

        @NotNull
        public final CL i;

        @NotNull
        public final N92 j;

        @NotNull
        public final C1774Pm1 k;

        public c() {
            this(0);
        }

        public static c a(c cVar, String str, boolean z, C2013So0 c2013So0, HF1 hf1, ArrayList arrayList, C3179ca2 c3179ca2, C4449id1 c4449id1, CL cl, N92 n92, C1774Pm1 c1774Pm1, int i) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            String myId = str;
            boolean z2 = (i & 2) != 0 ? cVar.b : true;
            if ((i & 4) != 0) {
                z = cVar.c;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                c2013So0 = cVar.d;
            }
            C2013So0 historyState = c2013So0;
            HF1 sendMessageState = (i & 16) != 0 ? cVar.e : hf1;
            List<AbstractC5723oS0.c> eventMessages = (i & 32) != 0 ? cVar.f : arrayList;
            C3179ca2 uploadFilesState = (i & 64) != 0 ? cVar.g : c3179ca2;
            C4449id1 pendingState = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cVar.h : c4449id1;
            CL contactFormState = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cVar.i : cl;
            N92 unsupportedState = (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cVar.j : n92;
            C1774Pm1 ratingState = (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cVar.k : c1774Pm1;
            Intrinsics.checkNotNullParameter(myId, "myId");
            Intrinsics.checkNotNullParameter(historyState, "historyState");
            Intrinsics.checkNotNullParameter(sendMessageState, "sendMessageState");
            Intrinsics.checkNotNullParameter(eventMessages, "eventMessages");
            Intrinsics.checkNotNullParameter(uploadFilesState, "uploadFilesState");
            Intrinsics.checkNotNullParameter(pendingState, "pendingState");
            Intrinsics.checkNotNullParameter(contactFormState, "contactFormState");
            Intrinsics.checkNotNullParameter(unsupportedState, "unsupportedState");
            Intrinsics.checkNotNullParameter(ratingState, "ratingState");
            return new c(myId, z2, z3, historyState, sendMessageState, eventMessages, uploadFilesState, pendingState, contactFormState, unsupportedState, ratingState);
        }

        public final int b() {
            return this.j.a.size() + this.g.a.size() + this.f.size() + this.e.a.size() + this.d.a.size() + (this.h.a != null ? 1 : 0) + (this.i.b != null ? 1 : 0) + (!(this.k.b instanceof AbstractC8106zm1.b) ? 1 : 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && Intrinsics.a(this.d, cVar.d) && Intrinsics.a(this.e, cVar.e) && Intrinsics.a(this.f, cVar.f) && Intrinsics.a(this.g, cVar.g) && Intrinsics.a(this.h, cVar.h) && Intrinsics.a(this.i, cVar.i) && Intrinsics.a(this.j, cVar.j) && Intrinsics.a(this.k, cVar.k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            int i = (iHashCode + r3) * 31;
            boolean z2 = this.c;
            return this.k.hashCode() + C5491nL.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.a.hashCode() + C5491nL.b(C5491nL.b((this.d.hashCode() + ((i + (z2 ? 1 : z2)) * 31)) * 31, 31, this.e.a), 31, this.f)) * 31)) * 31)) * 31, 31, this.j.a);
        }

        @NotNull
        public final String toString() {
            return "MessagesState(myId=" + this.a + ", hasWelcome=" + this.b + ", hasOffline=" + this.c + ", historyState=" + this.d + ", sendMessageState=" + this.e + ", eventMessages=" + this.f + ", uploadFilesState=" + this.g + ", pendingState=" + this.h + ", contactFormState=" + this.i + ", unsupportedState=" + this.j + ", ratingState=" + this.k + ')';
        }

        public c(@NotNull String myId, boolean z, boolean z2, @NotNull C2013So0 historyState, @NotNull HF1 sendMessageState, @NotNull List<AbstractC5723oS0.c> eventMessages, @NotNull C3179ca2 uploadFilesState, @NotNull C4449id1 pendingState, @NotNull CL contactFormState, @NotNull N92 unsupportedState, @NotNull C1774Pm1 ratingState) {
            Intrinsics.checkNotNullParameter(myId, "myId");
            Intrinsics.checkNotNullParameter(historyState, "historyState");
            Intrinsics.checkNotNullParameter(sendMessageState, "sendMessageState");
            Intrinsics.checkNotNullParameter(eventMessages, "eventMessages");
            Intrinsics.checkNotNullParameter(uploadFilesState, "uploadFilesState");
            Intrinsics.checkNotNullParameter(pendingState, "pendingState");
            Intrinsics.checkNotNullParameter(contactFormState, "contactFormState");
            Intrinsics.checkNotNullParameter(unsupportedState, "unsupportedState");
            Intrinsics.checkNotNullParameter(ratingState, "ratingState");
            this.a = myId;
            this.b = z;
            this.c = z2;
            this.d = historyState;
            this.e = sendMessageState;
            this.f = eventMessages;
            this.g = uploadFilesState;
            this.h = pendingState;
            this.i = contactFormState;
            this.j = unsupportedState;
            this.k = ratingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ c(int i) {
            C2013So0 c2013So0 = new C2013So0(7, 0L);
            HF1 hf1 = new HF1(0);
            List list = Collections.EMPTY_LIST;
            Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
            this("", false, false, c2013So0, hf1, list, new C3179ca2((int) (0 == true ? 1 : 0)), new C4449id1(null), new CL((boolean) (0 == true ? 1 : 0), 3), new N92((int) (0 == true ? 1 : 0)), new C1774Pm1(0 == true ? 1 : 0));
        }
    }

    public SF0(@NotNull M8 agentRepository, @NotNull InterfaceC5570ni1 profileRepository, @NotNull InterfaceC4855kK connectionStateRepository, @NotNull InterfaceC3940gB chatStateRepository, @NotNull InterfaceC1153Ho0 historyRepository, @NotNull InterfaceC7011ub1 paginationRepository, @NotNull AF1 sendMessageRepository, @NotNull InterfaceC7759y72 typingRepository, @NotNull R42 messageTransmitter, @NotNull InterfaceC7195vT0 logsRepository, @NotNull InterfaceC3389da2 uploadRepository, @NotNull EK1 storage, @NotNull C6102qE1 sdkContext, @NotNull InterfaceC3190cd1 pendingRepository, @NotNull InterfaceC7170vL contactFormRepository, @NotNull J92 unsupportedRepository, @NotNull InterfaceC0836Dm1 ratingRepository) {
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        Intrinsics.checkNotNullParameter(chatStateRepository, "chatStateRepository");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        Intrinsics.checkNotNullParameter(paginationRepository, "paginationRepository");
        Intrinsics.checkNotNullParameter(sendMessageRepository, "sendMessageRepository");
        Intrinsics.checkNotNullParameter(typingRepository, "typingRepository");
        Intrinsics.checkNotNullParameter(messageTransmitter, "messageTransmitter");
        Intrinsics.checkNotNullParameter(logsRepository, "logsRepository");
        Intrinsics.checkNotNullParameter(uploadRepository, "uploadRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(pendingRepository, "pendingRepository");
        Intrinsics.checkNotNullParameter(contactFormRepository, "contactFormRepository");
        Intrinsics.checkNotNullParameter(unsupportedRepository, "unsupportedRepository");
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        this.d = agentRepository;
        this.e = profileRepository;
        this.f = connectionStateRepository;
        this.g = chatStateRepository;
        this.h = historyRepository;
        this.i = paginationRepository;
        this.j = sendMessageRepository;
        this.k = typingRepository;
        this.l = messageTransmitter;
        this.m = logsRepository;
        this.n = uploadRepository;
        this.o = storage;
        this.p = sdkContext;
        this.q = pendingRepository;
        this.r = contactFormRepository;
        this.s = unsupportedRepository;
        this.t = ratingRepository;
        this.u = new Handler(Looper.getMainLooper());
        int i = 0;
        this.v = new CF0(this, i);
        this.w = new DF0(this, i);
        final EY0<c> ey0 = new EY0<>();
        ey0.k(new c(0));
        ey0.l(profileRepository.a(), new InterfaceC4819k81() { // from class: IF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                C6619si1 c6619si1 = (C6619si1) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.c cVar = (SF0.c) this_apply.d();
                this_apply.k(cVar != null ? SF0.c.a(cVar, c6619si1.a, false, null, null, null, null, null, null, null, null, 2046) : null);
            }
        });
        ey0.l(pendingRepository.a(), new InterfaceC4819k81() { // from class: JF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.c cVarA;
                C4449id1 it = (C4449id1) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    cVarA = SF0.c.a(cVar, null, false, null, null, null, null, it, null, null, null, 1919);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
                if (it.a != null) {
                    this$0.r.n(true);
                }
            }
        });
        ey0.l(contactFormRepository.a(), new InterfaceC4819k81() { // from class: LF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.c cVarA;
                SF0.c cVar;
                ClientMessage clientMessage;
                CL it = (CL) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SF0.c cVar2 = (SF0.c) this_apply.d();
                if (cVar2 != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    cVarA = SF0.c.a(cVar2, null, false, null, null, null, null, null, it, null, null, 1791);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
                if (!it.a || (cVar = (SF0.c) this_apply.d()) == null || (clientMessage = cVar.h.a) == null) {
                    return;
                }
                this$0.n(clientMessage);
                this$0.q.z();
            }
        });
        ey0.l(historyRepository.a(), new InterfaceC4819k81() { // from class: MF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                C2013So0 it = (C2013So0) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this_apply.k(SF0.c.a(cVar, null, false, it, null, null, null, null, null, null, null, 2039));
                if (it.a.isEmpty() && !cVar.b && cVar.h.a == null) {
                    this$0.u.postDelayed(this$0.v, 1000L);
                } else {
                    this$0.u.removeCallbacks(this$0.v);
                }
                this$0.l(cVar);
                EK1 ek1 = this$0.o;
                boolean zB = ek1.b();
                List<C0997Fo0> list = it.a;
                if (!zB && !list.isEmpty()) {
                    this$0.r.n(list.size() == 1);
                }
                IJ0<Object>[] ij0Arr = EK1.z;
                IJ0<Object> ij0 = ij0Arr[27];
                C6749tK1 c6749tK1 = ek1.y;
                if (StringsKt.I((String) c6749tK1.a(ij0, ek1)) || list.isEmpty()) {
                    return;
                }
                this$0.t.y((String) c6749tK1.a(ij0Arr[27], ek1));
            }
        });
        int i2 = 1;
        ey0.l(agentRepository.a(), new C4648jL(i2, this, ey0));
        ey0.l(sendMessageRepository.a(), new C4858kL(i2, ey0, this));
        ey0.l(logsRepository.a(), new InterfaceC4819k81() { // from class: NF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.c cVarA;
                List<AbstractC5723oS0> it = (List) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    this$0.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC5723oS0 abstractC5723oS0 : it) {
                        if ((abstractC5723oS0 instanceof AbstractC5723oS0.c) && ((AbstractC5723oS0.c) abstractC5723oS0).c == 1000) {
                            arrayList.add(abstractC5723oS0);
                        }
                    }
                    cVarA = SF0.c.a(cVar, null, false, null, null, arrayList, null, null, null, null, null, 2015);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
            }
        });
        ey0.l(uploadRepository.a(), new InterfaceC4819k81() { // from class: OF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.c cVarA;
                C3179ca2 it = (C3179ca2) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    cVarA = SF0.c.a(cVar, null, false, null, null, null, it, null, null, null, null, 1983);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
            }
        });
        ey0.l(unsupportedRepository.a(), new InterfaceC4819k81() { // from class: KF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.c cVarA;
                N92 it = (N92) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    cVarA = SF0.c.a(cVar, null, false, null, null, null, null, null, null, it, null, 1535);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
            }
        });
        ey0.l(ratingRepository.a(), new InterfaceC4819k81() { // from class: QF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.c cVarA;
                C1774Pm1 it = (C1774Pm1) obj;
                EY0 this_apply = ey0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    cVarA = SF0.c.a(cVar, null, false, null, null, null, null, null, null, null, it, 1023);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
            }
        });
        this.x = ey0;
        EY0 ey0A = C7747y42.a(ey0, new RF0(this));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(messagesState) { handleMessagesState(it) }");
        this.y = ey0A;
        this.z = new C2901bE<>();
        EY0 ey0A2 = C7747y42.a(typingRepository.a(), new C6634sm0(this, i2));
        Intrinsics.checkNotNullExpressionValue(ey0A2, "map(typingRepository.obs…String())\n        }\n    }");
        this.A = ey0A2;
        W11<String> w11 = new W11<>();
        w11.k("");
        this.B = w11;
        EY0 ey0A3 = C7747y42.a(agentRepository.a(), new C4904ka0(1));
        Intrinsics.checkNotNullExpressionValue(ey0A3, "map(agentRepository.obse…{\n        it.agents\n    }");
        this.C = ey0A3;
        EY0 ey0A4 = C7747y42.a(chatStateRepository.a(), new C6419rl(2));
        Intrinsics.checkNotNullExpressionValue(ey0A4, "map(chatStateRepository.…ed || it.sanctioned\n    }");
        this.D = ey0A4;
        EY0 ey1 = new EY0();
        ey1.k(new b(false, false, false));
        ey1.l(w11, new C6330rL(1, ey1));
        ey1.l(connectionStateRepository.getState(), new C6540sL(1, ey1));
        ey1.l(ey0, new C6750tL(1, ey1));
        EY0 ey0A5 = C7747y42.a(ey1, new JD(2));
        Intrinsics.checkNotNullExpressionValue(ey0A5, "map(_canSendState) {\n   …t.hasPendingMessage\n    }");
        this.E = ey0A5;
        EY0 ey0A6 = C7747y42.a(uploadRepository.I(), new EF0());
        Intrinsics.checkNotNullExpressionValue(ey0A6, "map(uploadRepository.hasLicense) { it }");
        this.F = ey0A6;
        W11 w12 = new W11();
        this.G = new W11<>();
        final EY0 ey2 = new EY0();
        ey2.k(new a(false, false, false));
        ey2.l(w12, new InterfaceC4819k81() { // from class: FF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                Boolean bool = (Boolean) obj;
                EY0 this_apply = ey2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.a aVar = (SF0.a) this_apply.d();
                this_apply.k(aVar != null ? SF0.a.a(aVar, Intrinsics.a(bool, Boolean.TRUE), false, false, 6) : null);
            }
        });
        ey2.l(connectionStateRepository.getState(), new InterfaceC4819k81() { // from class: GF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                AbstractC4645jK abstractC4645jK = (AbstractC4645jK) obj;
                EY0 this_apply = ey2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.a aVar = (SF0.a) this_apply.d();
                this_apply.k(aVar != null ? SF0.a.a(aVar, false, abstractC4645jK instanceof AbstractC4645jK.a, false, 5) : null);
            }
        });
        ey2.l(ey0, new InterfaceC4819k81() { // from class: HF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                SF0.a aVarA;
                SF0.c cVar = (SF0.c) obj;
                EY0 this_apply = ey2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.a aVar = (SF0.a) this_apply.d();
                if (aVar != null) {
                    aVarA = SF0.a.a(aVar, false, false, cVar.h.a != null, 3);
                } else {
                    aVarA = null;
                }
                this_apply.k(aVarA);
            }
        });
        EY0 ey0A7 = C7747y42.a(ey0, new C0681Bn());
        Intrinsics.checkNotNullExpressionValue(ey0A7, "map(messagesState) {\n   …ate.message == null\n    }");
        this.H = ey0A7;
        EY0 ey0A8 = C7747y42.a(ey2, new D8(3));
        Intrinsics.checkNotNullExpressionValue(ey0A8, "map(_canAttachState) {\n …t.hasPendingMessage\n    }");
        this.I = ey0A8;
    }

    public static C3520eB j(String str, AbstractC7844yZ0 data) {
        if (!StringsKt.I(data.b()) && !Intrinsics.a(data.b(), str)) {
            String strL = C3686f.l(data.d());
            if (strL.equals("document")) {
                if (C2432Xo.j(data.a())) {
                    return new A8(data);
                }
                Intrinsics.checkNotNullParameter(data, "message");
                Intrinsics.checkNotNullParameter(data, "data");
                return new C3933g9(8, data);
            }
            if (!strL.equals("photo")) {
                return new A8(data);
            }
            Intrinsics.checkNotNullParameter(data, "message");
            Intrinsics.checkNotNullParameter(data, "data");
            return new G8(9, data);
        }
        if (data instanceof C8059za2) {
            C8059za2 data2 = (C8059za2) data;
            if (data2.a.b.equals("photo")) {
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(data2, "data");
                return new Ea2(10, data2);
            }
            Intrinsics.checkNotNullParameter(data2, "data");
            Intrinsics.checkNotNullParameter(data2, "data");
            return new Aa2(11, data2);
        }
        String strL2 = C3686f.l(data.d());
        if (strL2.equals("document")) {
            if (C2432Xo.j(data.a())) {
                return new FD(data);
            }
            Intrinsics.checkNotNullParameter(data, "message");
            Intrinsics.checkNotNullParameter(data, "data");
            return new WD(6, data);
        }
        if (!strL2.equals("photo")) {
            return new FD(data);
        }
        Intrinsics.checkNotNullParameter(data, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        return new MD(7, data);
    }

    public static void k(String str, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC7844yZ0 c8059za2;
        int i = 0;
        if (arrayList.size() == 1) {
            arrayList2.add(j(str, (AbstractC7844yZ0) arrayList.get(0)));
        } else {
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    WE.l();
                    throw null;
                }
                AbstractC7844yZ0 abstractC7844yZ0 = (AbstractC7844yZ0) obj;
                AbstractC3926g70 position = i == 0 ? AbstractC3926g70.a.a : i == arrayList.size() - 1 ? AbstractC3926g70.b.a : AbstractC3926g70.c.a;
                abstractC7844yZ0.getClass();
                Intrinsics.checkNotNullParameter(position, "position");
                if (abstractC7844yZ0 instanceof L8) {
                    L8 l8 = (L8) abstractC7844yZ0;
                    C0997Fo0 message = l8.a;
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(position, "position");
                    c8059za2 = new L8(message, position, l8.c);
                } else if (abstractC7844yZ0 instanceof TD) {
                    C0997Fo0 message2 = ((TD) abstractC7844yZ0).a;
                    Intrinsics.checkNotNullParameter(message2, "message");
                    Intrinsics.checkNotNullParameter(position, "position");
                    c8059za2 = new TD(message2, position);
                } else if (abstractC7844yZ0 instanceof LF1) {
                    ClientMessage message3 = ((LF1) abstractC7844yZ0).a;
                    Intrinsics.checkNotNullParameter(message3, "message");
                    Intrinsics.checkNotNullParameter(position, "position");
                    c8059za2 = new LF1(message3, position);
                } else {
                    if (abstractC7844yZ0 instanceof C8059za2) {
                        C2980bd0 state = ((C8059za2) abstractC7844yZ0).a;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(position, "position");
                        c8059za2 = new C8059za2(state, position);
                    } else if (!(abstractC7844yZ0 instanceof C7671xi2) && !(abstractC7844yZ0 instanceof C5029l81)) {
                        throw new C6489s51();
                    }
                    arrayList2.add(j(str, abstractC7844yZ0));
                    i = i2;
                }
                abstractC7844yZ0 = c8059za2;
                arrayList2.add(j(str, abstractC7844yZ0));
                i = i2;
            }
        }
        arrayList.clear();
    }

    public static void m(TreeMap treeMap, long j, RA ra) {
        boolean z = true;
        while (z) {
            if (treeMap.get(Long.valueOf(j)) != null) {
                j++;
            } else {
                treeMap.put(Long.valueOf(j), ra);
                z = false;
            }
        }
    }

    public final void l(c cVar) {
        Handler handler = this.u;
        boolean z = cVar.c;
        DF0 df0 = this.w;
        if (!z) {
            handler.postDelayed(df0, 2000L);
            return;
        }
        handler.removeCallbacks(df0);
        EY0<c> ey0 = this.x;
        c cVarD = ey0.d();
        ey0.k(cVarD != null ? c.a(cVarD, null, false, null, null, null, null, null, null, null, null, 2043) : null);
    }

    public final void n(@NotNull ClientMessage message) {
        Collection collection;
        C2013So0 c2013So0;
        Intrinsics.checkNotNullParameter(message, "message");
        c cVarD = this.x.d();
        List<C0997Fo0> list = (cVarD == null || (c2013So0 = cVarD.d) == null) ? null : c2013So0.a;
        if (!this.o.b() && (((collection = (Collection) this.C.d()) == null || collection.isEmpty()) && (list == null || list.isEmpty()))) {
            this.q.b(message);
            return;
        }
        this.j.b(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.l.a(new SocketMessage(message.c, message.d, null, message.a, null, null, null, 116, null));
    }

    public final void o(boolean z) {
        this.g.x(z);
        if (z) {
            InterfaceC1153Ho0 interfaceC1153Ho0 = this.h;
            C2013So0 state = interfaceC1153Ho0.getState();
            C0997Fo0 c0997Fo0 = (C0997Fo0) CollectionsKt.N(state.a);
            if (c0997Fo0 != null) {
                if (Intrinsics.a(c0997Fo0.c, this.e.getId())) {
                    return;
                }
                long j = state.c;
                long j2 = c0997Fo0.f;
                if (j2 != j) {
                    String msgId = c0997Fo0.a;
                    Intrinsics.checkNotNullParameter(msgId, "msgId");
                    this.l.a(new SocketMessage("atom/message.ack", msgId, null, null, null, null, null, 124, null));
                    interfaceC1153Ho0.B(j2);
                }
            }
        }
    }
}
