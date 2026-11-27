package defpackage;

import com.jivosite.sdk.socket.JivoWebSocketService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Rf2 {
    public final EN1 a;
    public final NP1 b;
    public final C0994Fn0 c;
    public final RQ0 d;
    public final C0965Fd1 e;
    public final C0893Ef1 f;
    public C7032ug2 h;
    public Ag2 i;
    public C1540Mn1 j;
    public C5793ol2 k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public C6822tg2 s;
    public AbstractC4707jd1 t;
    public final Object g = new Object();
    public final Object n = new Object();

    public Rf2(boolean z, String str, String str2, String str3, EN1 en1) {
        this.a = en1;
        NP1 np1 = new NP1();
        np1.b = NP1.a.d;
        np1.a = EnumC5357mh2.d;
        this.b = np1;
        this.c = new C0994Fn0(str, str2, str3, z);
        this.d = new RQ0(this);
        this.e = new C0965Fd1(this, "PingSender", new C2931bO());
        this.f = new C0893Ef1(this, "PongSender", new C2931bO());
    }

    public final void a() {
        synchronized (this.n) {
            try {
                if (this.m) {
                    return;
                }
                this.m = true;
                RQ0 rq0 = this.d;
                for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
                    try {
                        interfaceC7873yg2.a();
                    } catch (Throwable th) {
                        rq0.a(interfaceC7873yg2, th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() throws C6193qg2 {
        EnumC5357mh2 enumC5357mh2;
        synchronized (this.b) {
            NP1 np1 = this.b;
            if (np1.a != EnumC5357mh2.d) {
                throw new C6193qg2(EnumC5773og2.d, "The current state of the WebSocket is not CREATED.");
            }
            enumC5357mh2 = EnumC5357mh2.e;
            np1.a = enumC5357mh2;
        }
        this.d.d(enumC5357mh2);
        try {
            EN1 en1 = this.a;
            try {
                en1.a();
                i(en1.f);
                ArrayList<C6402rg2> arrayList = this.l;
                AbstractC4707jd1 abstractC4707jd1 = null;
                if (arrayList != null) {
                    for (C6402rg2 c6402rg2 : arrayList) {
                        if (c6402rg2 instanceof AbstractC4707jd1) {
                            abstractC4707jd1 = (AbstractC4707jd1) c6402rg2;
                            break;
                        }
                    }
                }
                this.t = abstractC4707jd1;
                NP1 np2 = this.b;
                EnumC5357mh2 enumC5357mh3 = EnumC5357mh2.g;
                np2.a = enumC5357mh3;
                this.d.d(enumC5357mh3);
                C1540Mn1 c1540Mn1 = new C1540Mn1(this);
                C5793ol2 c5793ol2 = new C5793ol2(this);
                synchronized (this.g) {
                    this.j = c1540Mn1;
                    this.k = c5793ol2;
                }
                RQ0 rq0 = c1540Mn1.d.d;
                if (rq0 != null) {
                    rq0.e(c1540Mn1.e, c1540Mn1);
                }
                RQ0 rq1 = c5793ol2.d.d;
                if (rq1 != null) {
                    rq1.e(c5793ol2.e, c5793ol2);
                }
                c1540Mn1.start();
                c5793ol2.start();
            } catch (C6193qg2 e) {
                Socket socket = en1.f;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (C6193qg2 e2) {
            Socket socket2 = this.a.f;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            NP1 np3 = this.b;
            EnumC5357mh2 enumC5357mh4 = EnumC5357mh2.i;
            np3.a = enumC5357mh4;
            this.d.d(enumC5357mh4);
            throw e2;
        }
    }

    public final void c(int i, String str) {
        C1540Mn1 c1540Mn1;
        C5793ol2 c5793ol2;
        synchronized (this.b) {
            try {
                int iOrdinal = this.b.a.ordinal();
                if (iOrdinal == 0) {
                    C8069zd0 c8069zd0 = new C8069zd0("FinishThread", this, KY1.h);
                    RQ0 rq0 = c8069zd0.d.d;
                    if (rq0 != null) {
                        rq0.e(c8069zd0.e, c8069zd0);
                    }
                    c8069zd0.start();
                    return;
                }
                if (iOrdinal != 2) {
                    return;
                }
                NP1 np1 = this.b;
                NP1.a aVar = NP1.a.g;
                EnumC5357mh2 enumC5357mh2 = EnumC5357mh2.h;
                np1.a = enumC5357mh2;
                if (np1.b == NP1.a.d) {
                    np1.b = aVar;
                }
                g(C6822tg2.a(i, str));
                this.d.d(enumC5357mh2);
                synchronized (this.g) {
                    c1540Mn1 = this.j;
                    c5793ol2 = this.k;
                    this.j = null;
                    this.k = null;
                }
                if (c1540Mn1 != null) {
                    synchronized (c1540Mn1) {
                        try {
                            if (!c1540Mn1.g) {
                                c1540Mn1.g = true;
                                c1540Mn1.interrupt();
                                c1540Mn1.n = 10000L;
                                c1540Mn1.f();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (c5793ol2 != null) {
                    synchronized (c5793ol2) {
                        c5793ol2.i = true;
                        c5793ol2.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        EnumC5357mh2 enumC5357mh2;
        C0965Fd1 c0965Fd1 = this.e;
        synchronized (c0965Fd1) {
            try {
                Timer timer = c0965Fd1.c;
                if (timer != null) {
                    c0965Fd1.d = false;
                    timer.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0893Ef1 c0893Ef1 = this.f;
        synchronized (c0893Ef1) {
            try {
                Timer timer2 = c0893Ef1.c;
                if (timer2 != null) {
                    c0893Ef1.d = false;
                    timer2.cancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Socket socket = this.a.f;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.b) {
            NP1 np1 = this.b;
            enumC5357mh2 = EnumC5357mh2.i;
            np1.a = enumC5357mh2;
        }
        this.d.d(enumC5357mh2);
        RQ0 rq0 = this.d;
        C6822tg2 c6822tg2 = this.s;
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
            try {
                interfaceC7873yg2.d(c6822tg2);
            } catch (Throwable th3) {
                rq0.a(interfaceC7873yg2, th3);
            }
        }
    }

    public final boolean e(EnumC5357mh2 enumC5357mh2) {
        boolean z;
        synchronized (this.b) {
            z = this.b.a == enumC5357mh2;
        }
        return z;
    }

    public final void f(JivoWebSocketService.a aVar) {
        RQ0 rq0 = this.d;
        if (aVar == null) {
            rq0.getClass();
            return;
        }
        synchronized (rq0.b) {
            try {
                if (rq0.b.remove(aVar)) {
                    rq0.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (e(EnumC5357mh2.d)) {
            d();
        }
        super.finalize();
    }

    public final void g(C6822tg2 c6822tg2) {
        int i;
        int i2;
        if (c6822tg2 == null) {
            return;
        }
        synchronized (this.b) {
            try {
                EnumC5357mh2 enumC5357mh2 = this.b.a;
                if (enumC5357mh2 == EnumC5357mh2.g || enumC5357mh2 == EnumC5357mh2.h) {
                    C5793ol2 c5793ol2 = this.k;
                    if (c5793ol2 == null) {
                        return;
                    }
                    synchronized (c5793ol2) {
                        try {
                            if (c5793ol2.k) {
                                return;
                            }
                            if (!c5793ol2.i && c5793ol2.j == null && (8 > (i2 = c6822tg2.e) || i2 > 15)) {
                                c5793ol2.d.getClass();
                            }
                            int i3 = c6822tg2.e;
                            if (i3 == 9 || i3 == 10) {
                                LinkedList<C6822tg2> linkedList = c5793ol2.g;
                                Iterator<C6822tg2> it = linkedList.iterator();
                                int i4 = 0;
                                while (it.hasNext() && ((i = it.next().e) == 9 || i == 10)) {
                                    i4++;
                                }
                                linkedList.add(i4, c6822tg2);
                            } else {
                                c5793ol2.g.addLast(c6822tg2);
                            }
                            c5793ol2.notifyAll();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(String str) {
        C6822tg2 c6822tg2 = new C6822tg2();
        c6822tg2.a = true;
        c6822tg2.e = 1;
        if (str == null || str.length() == 0) {
            c6822tg2.g = null;
        } else {
            c6822tg2.d(C6889u01.a(str));
        }
        g(c6822tg2);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x028c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0233  */
    public final TreeMap i(Socket socket) throws C6193qg2 {
        int i;
        String str;
        C6402rg2 c6402rg2;
        C6402rg2 c6402rg3;
        String strSubstring;
        try {
            C7032ug2 c7032ug2 = new C7032ug2(new BufferedInputStream(socket.getInputStream()));
            try {
                Ag2 ag2 = new Ag2(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                C6889u01.a.nextBytes(bArr);
                String strH = C0564Aa.h(bArr);
                C0994Fn0 c0994Fn0 = this.c;
                c0994Fn0.d = strH;
                String strB = C5807oq.b(new StringBuilder("GET "), c0994Fn0.c, " HTTP/1.1");
                ArrayList<String[]> arrayList = new ArrayList();
                arrayList.add(new String[]{"Host", c0994Fn0.b});
                arrayList.add(C0994Fn0.f);
                arrayList.add(C0994Fn0.g);
                arrayList.add(C0994Fn0.h);
                arrayList.add(new String[]{"Sec-WebSocket-Key", c0994Fn0.d});
                String str2 = c0994Fn0.a;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new String[]{"Authorization", "Basic " + C0564Aa.h(C6889u01.a(str2))});
                }
                ArrayList arrayList2 = c0994Fn0.e;
                if (arrayList2 != null && arrayList2.size() != 0) {
                    arrayList.addAll(c0994Fn0.e);
                }
                StringBuilder sbB = K1.b(strB, "\r\n");
                for (String[] strArr : arrayList) {
                    sbB.append(strArr[0]);
                    sbB.append(": ");
                    sbB.append(strArr[1]);
                    sbB.append("\r\n");
                }
                sbB.append("\r\n");
                String string = sbB.toString();
                RQ0 rq0 = this.d;
                for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
                    try {
                        interfaceC7873yg2.getClass();
                    } catch (Throwable th) {
                        rq0.a(interfaceC7873yg2, th);
                    }
                }
                try {
                    ag2.write(C6889u01.a(string));
                    ag2.flush();
                    try {
                        String strB2 = C6889u01.b(c7032ug2);
                        if (strB2 == null || strB2.length() == 0) {
                            throw new C6193qg2(EnumC5773og2.j, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            C2715aQ1 c2715aQ1 = new C2715aQ1(strB2);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb = null;
                            while (true) {
                                try {
                                    String strB3 = C6889u01.b(c7032ug2);
                                    if (strB3 == null || strB3.length() == 0) {
                                        break;
                                    }
                                    char cCharAt = strB3.charAt(0);
                                    if (cCharAt != ' ' && cCharAt != '\t') {
                                        if (sb != null) {
                                            C0564Aa.t(treeMap, sb.toString());
                                        }
                                        sb = new StringBuilder(strB3);
                                    } else if (sb != null) {
                                        sb.append(strB3.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e) {
                                    throw new C6193qg2(EnumC5773og2.m, "An error occurred while HTTP header section was being read: " + e.getMessage(), e);
                                }
                            }
                            if (sb != null) {
                                C0564Aa.t(treeMap, sb.toString());
                            }
                            if (c2715aQ1.a != 101) {
                                try {
                                    i = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused) {
                                    i = -1;
                                }
                                if (i > 0) {
                                    try {
                                        c7032ug2.c(i, new byte[i]);
                                    } catch (Throwable unused2) {
                                    }
                                }
                                throw new O91(EnumC5773og2.l, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + c2715aQ1, treeMap);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new O91(EnumC5773og2.n, "The opening handshake response does not contain 'Upgrade' header.", treeMap);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                for (String str3 : ((String) it.next()).split("\\s*,\\s*")) {
                                    if ("websocket".equalsIgnoreCase(str3)) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new O91(EnumC5773og2.p, "The opening handshake response does not contain 'Connection' header.", treeMap);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            for (String str4 : ((String) it2.next()).split("\\s*,\\s*")) {
                                                if ("Upgrade".equalsIgnoreCase(str4)) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new O91(EnumC5773og2.r, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", treeMap);
                                                    }
                                                    try {
                                                        if (!C0564Aa.h(MessageDigest.getInstance("SHA-1").digest(C6889u01.a(Z0.c(strH, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new O91(EnumC5773og2.s, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", treeMap);
                                                        }
                                                    } catch (Exception unused3) {
                                                    }
                                                    List list4 = (List) treeMap.get("Sec-WebSocket-Extensions");
                                                    if (list4 != null && list4.size() != 0) {
                                                        ArrayList<C6402rg2> arrayList3 = new ArrayList();
                                                        Iterator it3 = list4.iterator();
                                                        while (it3.hasNext()) {
                                                            String[] strArrSplit = ((String) it3.next()).split("\\s*,\\s*");
                                                            if (strArrSplit.length > 0) {
                                                                String str5 = strArrSplit[0];
                                                                if (str5 == null) {
                                                                    c6402rg3 = null;
                                                                } else {
                                                                    String[] strArrSplit2 = str5.trim().split("\\s*;\\s*");
                                                                    if (strArrSplit2.length == 0) {
                                                                        c6402rg3 = null;
                                                                    } else {
                                                                        String str6 = strArrSplit2[0];
                                                                        if (C8056za.n(str6)) {
                                                                            if ("permessage-deflate".equals(str6)) {
                                                                                C4917kd1 c4917kd1 = new C4917kd1(str6);
                                                                                c4917kd1.c = 32768;
                                                                                c6402rg2 = c4917kd1;
                                                                            } else {
                                                                                c6402rg2 = new C6402rg2(str6);
                                                                            }
                                                                            for (int i2 = 1; i2 < strArrSplit2.length; i2++) {
                                                                                String[] strArrSplit3 = strArrSplit2[i2].split("\\s*=\\s*", 2);
                                                                                if (strArrSplit3.length != 0 && strArrSplit3[0].length() != 0) {
                                                                                    String str7 = strArrSplit3[0];
                                                                                    if (C8056za.n(str7)) {
                                                                                        if (strArrSplit3.length == 2 && (strSubstring = strArrSplit3[1]) != null) {
                                                                                            int length = strSubstring.length();
                                                                                            if (length >= 2 && strSubstring.charAt(0) == '\"') {
                                                                                                int i3 = length - 1;
                                                                                                if (strSubstring.charAt(i3) == '\"') {
                                                                                                    strSubstring = strSubstring.substring(1, i3);
                                                                                                    if (strSubstring == null) {
                                                                                                        strSubstring = null;
                                                                                                    } else if (strSubstring.indexOf(92) >= 0) {
                                                                                                        int length2 = strSubstring.length();
                                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                                        boolean z = false;
                                                                                                        for (int i4 = 0; i4 < length2; i4++) {
                                                                                                            char cCharAt2 = strSubstring.charAt(i4);
                                                                                                            if (cCharAt2 != '\\' || z) {
                                                                                                                sb2.append(cCharAt2);
                                                                                                                z = false;
                                                                                                            } else {
                                                                                                                z = true;
                                                                                                            }
                                                                                                        }
                                                                                                        strSubstring = sb2.toString();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            strSubstring = null;
                                                                                        }
                                                                                        if (strSubstring == null || C8056za.n(strSubstring)) {
                                                                                            if (!C8056za.n(str7)) {
                                                                                                throw new IllegalArgumentException("'key' is not a valid token.");
                                                                                            }
                                                                                            if (strSubstring != null && !C8056za.n(strSubstring)) {
                                                                                                throw new IllegalArgumentException("'value' is not a valid token.");
                                                                                            }
                                                                                            c6402rg2.b.put(str7, strSubstring);
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                            c6402rg3 = c6402rg2;
                                                                        } else {
                                                                            c6402rg3 = null;
                                                                        }
                                                                    }
                                                                }
                                                                if (c6402rg3 == null) {
                                                                    throw new O91(EnumC5773og2.t, C5491nL.c("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str5), treeMap);
                                                                }
                                                                String str8 = c6402rg3.a;
                                                                C0994Fn0 c0994Fn1 = this.c;
                                                                if (str8 == null) {
                                                                    c0994Fn1.getClass();
                                                                }
                                                                throw new O91(EnumC5773og2.u, C5491nL.c("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str8), treeMap);
                                                            }
                                                        }
                                                        C6402rg2 c6402rg4 = null;
                                                        for (C6402rg2 c6402rg5 : arrayList3) {
                                                            if (c6402rg5 instanceof AbstractC4707jd1) {
                                                                if (c6402rg4 != null) {
                                                                    throw new O91(EnumC5773og2.v, "'" + c6402rg4.a + "' extension and '" + c6402rg5.a + "' extension conflict with each other.", treeMap);
                                                                }
                                                                c6402rg4 = c6402rg5;
                                                            }
                                                        }
                                                        this.l = arrayList3;
                                                    }
                                                    List list5 = (List) treeMap.get("Sec-WebSocket-Protocol");
                                                    if (list5 != null && (str = (String) list5.get(0)) != null && str.length() != 0) {
                                                        synchronized (this.c) {
                                                        }
                                                        throw new O91(EnumC5773og2.w, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), treeMap);
                                                    }
                                                    this.h = c7032ug2;
                                                    this.i = ag2;
                                                    return treeMap;
                                                }
                                            }
                                        }
                                        throw new O91(EnumC5773og2.q, "'Upgrade' was not found in 'Connection' header.", treeMap);
                                    }
                                }
                            }
                            throw new O91(EnumC5773og2.o, "'websocket' was not found in 'Upgrade' header.", treeMap);
                        } catch (Exception unused4) {
                            throw new C6193qg2(EnumC5773og2.k, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(strB2));
                        }
                    } catch (IOException e2) {
                        throw new C6193qg2(EnumC5773og2.i, "Failed to read an opening handshake response from the server: " + e2.getMessage(), e2);
                    }
                } catch (IOException e3) {
                    throw new C6193qg2(EnumC5773og2.h, "Failed to send an opening handshake request to the server: " + e3.getMessage(), e3);
                }
            } catch (IOException e4) {
                throw new C6193qg2(EnumC5773og2.g, "Failed to get the output stream from the raw socket: " + e4.getMessage(), e4);
            }
        } catch (IOException e5) {
            throw new C6193qg2(EnumC5773og2.e, "Failed to get the input stream of the raw socket: " + e5.getMessage(), e5);
        }
    }
}
