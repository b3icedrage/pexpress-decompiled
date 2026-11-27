package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4059gl {

    @NotNull
    public static final Set<Integer> e;

    @NotNull
    public static final Set<Integer> f;

    @NotNull
    public static final Set<Integer> g;

    @NotNull
    public final ConcurrentHashMap<String, AtomicInteger> a = new ConcurrentHashMap<>();

    @NotNull
    public final C6295r91 b = new C6295r91(10);

    @NotNull
    public final C6295r91 c = new C6295r91();

    @NotNull
    public final C6295r91 d = new C6295r91();

    static {
        CommonError.Codes codes = CommonError.Codes.IncorrectCredentials;
        Integer numValueOf = Integer.valueOf(codes.getValue());
        CommonError.Codes codes2 = CommonError.Codes.EmailAlreadyRegistered;
        Integer[] elements = {numValueOf, Integer.valueOf(codes2.getValue())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = C1526Mj.H(elements);
        Integer[] elements2 = {Integer.valueOf(codes.getValue()), Integer.valueOf(codes2.getValue()), Integer.valueOf(CommonError.Codes.UserAlreadyRegistered.getValue()), Integer.valueOf(CommonError.Codes.InvalidEmail.getValue()), Integer.valueOf(CommonError.Codes.ErrorEmailNotExists.getValue()), Integer.valueOf(CommonError.Codes.WrongCaptcha.getValue()), Integer.valueOf(CommonError.Codes.ErrorTooManyRequests.getValue()), Integer.valueOf(CommonError.Codes.RecoveryAlreadySent.getValue()), Integer.valueOf(CommonError.Codes.CurrentEmail.getValue()), Integer.valueOf(CommonError.Codes.ValidationError.getValue()), Integer.valueOf(CommonError.Codes.IncorrectAuthCode.getValue()), Integer.valueOf(CommonError.Codes.NotInternet.getValue())};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f = C1526Mj.H(elements2);
        Integer[] elements3 = {Integer.valueOf(CommonError.Codes.TimeoutException.getValue()), Integer.valueOf(CommonError.Codes.NotWebSocketConnection.getValue()), Integer.valueOf(CommonError.Codes.VPN.getValue()), Integer.valueOf(CommonError.Codes.SessionMissing.getValue())};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        g = C1526Mj.H(elements3);
    }

    public final boolean a(int i, List list) {
        AtomicInteger atomicIntegerPutIfAbsent;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.a;
        String strJ = CollectionsKt.J(list, "|", null, null, null, 62);
        AtomicInteger atomicInteger = concurrentHashMap.get(strJ);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(strJ, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        return atomicInteger.incrementAndGet() <= i;
    }
}
