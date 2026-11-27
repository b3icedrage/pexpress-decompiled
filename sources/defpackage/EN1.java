package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class EN1 {
    public final SocketFactory a;
    public final C5660o8 b;
    public EnumC5225m40 c = EnumC5225m40.d;
    public int d = 250;
    public boolean e;
    public Socket f;

    public EN1(SocketFactory socketFactory, C5660o8 c5660o8, C1768Pk1 c1768Pk1, SSLSocketFactory sSLSocketFactory) {
        this.a = socketFactory;
        this.b = c5660o8;
    }

    public final void a() {
        InetAddress[] allByName;
        String str = "";
        C5660o8 c5660o8 = this.b;
        IN1 in1 = new IN1(this.a, c5660o8, this.c, this.d);
        UnknownHostException e = null;
        try {
            allByName = InetAddress.getAllByName(c5660o8.a);
            try {
                Arrays.sort(allByName, new CN1());
            } catch (UnknownHostException e2) {
                e = e2;
            }
        } catch (UnknownHostException e3) {
            allByName = null;
            e = e3;
        }
        EnumC5773og2 enumC5773og2 = EnumC5773og2.S;
        if (allByName == null || allByName.length <= 0) {
            if (e == null) {
                e = new UnknownHostException("No IP addresses found");
            }
            throw new C6193qg2(enumC5773og2, "Failed to resolve hostname " + c5660o8 + ": " + e.getMessage(), e);
        }
        try {
            Socket socketA = in1.a(allByName);
            this.f = socketA;
            if (socketA instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socketA;
                if (this.e) {
                    C6082q81 c6082q81 = C6082q81.a;
                    SSLSession session = sSLSocket.getSession();
                    String str2 = c5660o8.a;
                    if (c6082q81.verify(str2, session)) {
                        return;
                    }
                    EnumC5773og2 enumC5773og3 = EnumC5773og2.V;
                    try {
                        str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                    } catch (Exception unused) {
                    }
                    throw new C4752jp0(enumC5773og3, C4694ja0.a("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
                }
            }
        } catch (Exception e4) {
            throw new C6193qg2(enumC5773og2, "Failed to connect to '" + c5660o8 + "': " + e4.getMessage(), e4);
        }
    }
}
