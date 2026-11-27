package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pexpress.tool.R;
import defpackage.AbstractC5023l7;
import defpackage.AbstractC6076q7;
import defpackage.AbstractC6705t7;
import defpackage.ActivityC2686aH;
import defpackage.C0809Dd1;
import defpackage.C3803fZ0;
import defpackage.C5704oM;
import defpackage.C6412rj0;
import defpackage.ED;
import defpackage.F02;
import defpackage.F62;
import defpackage.FP0;
import defpackage.InterfaceC3096c91;
import defpackage.InterfaceC3174cZ0;
import defpackage.InterfaceC3725f91;
import defpackage.InterfaceC3760fL;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC4813k7;
import defpackage.InterfaceC5324mZ0;
import defpackage.InterfaceC5666o91;
import defpackage.InterfaceC7546x7;
import defpackage.K11;
import defpackage.ML0;
import defpackage.N7;
import defpackage.NC1;
import defpackage.OC1;
import defpackage.Q81;
import defpackage.R51;
import defpackage.RB0;
import defpackage.RunnableC2555Zd;
import defpackage.RunnableC3329dH;
import defpackage.RunnableC3538eH;
import defpackage.RunnableC7146vD;
import defpackage.U11;
import defpackage.U81;
import defpackage.VP;
import defpackage.Vd2;
import defpackage.W81;
import defpackage.Wd2;
import defpackage.XO0;
import defpackage.Y6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u0002:\nÜ\u0001Ý\u0001Þ\u0001ß\u0001à\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0017\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001e\u0010!J#\u0010\u001e\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b\u001e\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0015H\u0017¢\u0006\u0004\b&\u0010\u000fJ\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J)\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u0002022\u0006\u0010/\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u0002022\u0006\u0010/\u001a\u00020\u00102\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\b?\u0010BJ'\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020\u00032\u0006\u0010D\u001a\u00020CH\u0017¢\u0006\u0004\b?\u0010EJ\u0017\u0010F\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bF\u0010@J\u000f\u0010G\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\u0015H\u0017¢\u0006\u0004\bH\u0010\u000fJ\u001f\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u0010H\u0017¢\u0006\u0004\bL\u0010MJ)\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\bL\u0010OJA\u0010U\u001a\u00020\u00152\u0006\u0010J\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010I2\u0006\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u0010H\u0017¢\u0006\u0004\bU\u0010VJK\u0010U\u001a\u00020\u00152\u0006\u0010J\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010I2\u0006\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\bU\u0010WJ)\u0010Z\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00102\b\u0010Y\u001a\u0004\u0018\u00010IH\u0015¢\u0006\u0004\bZ\u0010[J-\u0010a\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u00102\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010`\u001a\u00020_H\u0017¢\u0006\u0004\ba\u0010bJI\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010c\"\u0004\b\u0001\u0010d2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010e2\u0006\u0010h\u001a\u00020g2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00010i¢\u0006\u0004\bl\u0010mJA\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010c\"\u0004\b\u0001\u0010d2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010e2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00010i¢\u0006\u0004\bl\u0010nJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0004\bq\u0010rJ\u001b\u0010t\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020o0s¢\u0006\u0004\bt\u0010uJ\u001b\u0010v\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020o0s¢\u0006\u0004\bv\u0010uJ\u0017\u0010x\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u0010H\u0017¢\u0006\u0004\bx\u0010\u0012J\u001b\u0010y\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100s¢\u0006\u0004\by\u0010uJ\u001b\u0010z\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100s¢\u0006\u0004\bz\u0010uJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010J\u001a\u00020IH\u0015¢\u0006\u0004\b{\u0010|J\u001b\u0010}\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020I0s¢\u0006\u0004\b}\u0010uJ\u001b\u0010~\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020I0s¢\u0006\u0004\b~\u0010uJ\u001a\u0010\u0080\u0001\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u000202H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\"\u0010\u0080\u0001\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u0002022\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0082\u0001J\u001e\u0010\u0084\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010s¢\u0006\u0005\b\u0084\u0001\u0010uJ\u001e\u0010\u0085\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010s¢\u0006\u0005\b\u0085\u0001\u0010uJ\u001b\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u000202H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0081\u0001J#\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u0002022\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0082\u0001J\u001e\u0010\u0089\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010s¢\u0006\u0005\b\u0089\u0001\u0010uJ\u001e\u0010\u008a\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010s¢\u0006\u0005\b\u008a\u0001\u0010uJ\u0011\u0010\u008b\u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b\u008b\u0001\u0010\u000fJ\u0019\u0010\u008d\u0001\u001a\u00020\u00152\u0007\u0010+\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010+\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u000fJ\u0011\u0010\u0091\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u000fJ\u001c\u0010\u0094\u0001\u001a\u00020\u00152\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0013\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010 \u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b \u0001\u0010¡\u0001\u0012\u0005\b¢\u0001\u0010\u000fR\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¦\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R!\u0010\u00ad\u0001\u001a\u00030¨\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010cR\u0018\u0010¯\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010±\u0001\u001a\u00020g8\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R$\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010·\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010·\u0001R%\u0010º\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010·\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0088\u00010s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010·\u0001R\u001f\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010·\u0001R\u0019\u0010½\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010¿\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030À\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010ª\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R(\u0010É\u0001\u001a\u00030\u0092\u00018FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÅ\u0001\u0010ª\u0001\u0012\u0005\bÈ\u0001\u0010\u000f\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\u001bR\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ò\u0001\u001a\u00030£\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010Ú\u0001\u001a\u00030×\u00018F¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001¨\u0006á\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "LaH;", "", "LFP0;", "LWd2;", "Landroidx/lifecycle/e;", "LOC1;", "LQ81;", "Lx7;", "LU81;", "Lo91;", "Lc91;", "Lf91;", "LcZ0;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", Promotion.ACTION_VIEW, "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "LW81;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(LW81;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "LmZ0;", "provider", "addMenuProvider", "(LmZ0;)V", "owner", "(LmZ0;LFP0;)V", "Landroidx/lifecycle/g$b;", "state", "(LmZ0;LFP0;Landroidx/lifecycle/g$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Ll7;", "contract", "Lt7;", "registry", "Lk7;", "callback", "Lq7;", "registerForActivityResult", "(Ll7;Lt7;Lk7;)Lq7;", "(Ll7;Lk7;)Lq7;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "LfL;", "addOnConfigurationChangedListener", "(LfL;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "LK11;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "LDd1;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/ComponentActivity$d;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$d;", "LoM;", "contextAwareHelper", "LoM;", "LfZ0;", "menuHostHelper", "LfZ0;", "LNC1;", "savedStateRegistryController", "LNC1;", "getSavedStateRegistryController$annotations", "LVd2;", "_viewModelStore", "LVd2;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$d;", "Lrj0;", "fullyDrawnReporter$delegate", "LfO0;", "getFullyDrawnReporter", "()Lrj0;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lt7;", "getActivityResultRegistry", "()Lt7;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/x$b;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/x$b;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "getViewModelStore", "()LVd2;", "viewModelStore", "LVP;", "getDefaultViewModelCreationExtras", "()LVP;", "defaultViewModelCreationExtras", "Landroidx/savedstate/a;", "getSavedStateRegistry", "()Landroidx/savedstate/a;", "savedStateRegistry", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "c", "d", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends ActivityC2686aH implements Wd2, androidx.lifecycle.e, OC1, Q81, InterfaceC7546x7, U81, InterfaceC5666o91, InterfaceC3096c91, InterfaceC3725f91, InterfaceC3174cZ0 {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final b Companion = new b();

    @Nullable
    private Vd2 _viewModelStore;

    @NotNull
    private final AbstractC6705t7 activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final C5704oM contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 fullyDrawnReporter;

    @NotNull
    private final C3803fZ0 menuHostHelper;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 onBackPressedDispatcher;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC3760fL<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC3760fL<K11>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC3760fL<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC3760fL<C0809Dd1>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC3760fL<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final d reportFullyDrawnExecutor;

    @NotNull
    private final NC1 savedStateRegistryController;

    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public final OnBackInvokedDispatcher a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    public static final class b {
    }

    public static final class c {

        @Nullable
        public Object a;

        @Nullable
        public Vd2 b;
    }

    public interface d extends Executor {
        void f();

        void i0(@NotNull View view);
    }

    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {
        public final long d = SystemClock.uptimeMillis() + ((long) 10000);

        @Nullable
        public Runnable e;
        public boolean g;

        public e() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.e = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.g) {
                decorView.postOnAnimation(new RunnableC7146vD(this, 1));
            } else if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public final void f() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.d
        public final void i0(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.g) {
                return;
            }
            this.g = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.e;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.d) {
                    this.g = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.e = null;
            C6412rj0 fullyDrawnReporter = ComponentActivity.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                z = fullyDrawnReporter.b;
            }
            if (z) {
                this.g = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class f extends AbstractC6705t7 {
        public f() {
        }

        @Override // defpackage.AbstractC6705t7
        public final void b(final int i, @NotNull AbstractC5023l7 contract, Object obj) {
            Bundle bundleExtra;
            final int i2;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC5023l7.a aVarB = contract.b(componentActivity, obj);
            if (aVarB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: bH
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f this$0 = this.d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Serializable serializable = aVarB.a;
                        String str = (String) this$0.a.get(Integer.valueOf(i));
                        if (str == null) {
                            return;
                        }
                        AbstractC6705t7.a aVar = (AbstractC6705t7.a) this$0.e.get(str);
                        if ((aVar != null ? aVar.a : null) == null) {
                            this$0.g.remove(str);
                            this$0.f.put(str, serializable);
                            return;
                        }
                        InterfaceC4813k7<O> interfaceC4813k7 = aVar.a;
                        Intrinsics.c(interfaceC4813k7, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (this$0.d.remove(str)) {
                            interfaceC4813k7.b((O) serializable);
                        }
                    }
                });
                return;
            }
            Intent intentA = contract.a(componentActivity, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                Y6.a(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                componentActivity.startActivityForResult(intentA, i, bundle);
                return;
            }
            RB0 rb0 = (RB0) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(rb0);
                i2 = i;
                try {
                    componentActivity.startIntentSenderForResult(rb0.d, i2, rb0.e, rb0.g, rb0.h, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: cH
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.f this$0 = this.d;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            IntentSender.SendIntentException e2 = sendIntentException;
                            Intrinsics.checkNotNullParameter(e2, "$e");
                            this$0.a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e2));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        }
    }

    public static final class g extends ML0 implements Function0<t> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final t invoke() {
            ComponentActivity componentActivity = ComponentActivity.this;
            return new t(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
        }
    }

    public static final class h extends ML0 implements Function0<C6412rj0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6412rj0 invoke() {
            ComponentActivity componentActivity = ComponentActivity.this;
            return new C6412rj0(componentActivity.reportFullyDrawnExecutor, new androidx.activity.a(componentActivity));
        }
    }

    public static final class i extends ML0 implements Function0<OnBackPressedDispatcher> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OnBackPressedDispatcher invoke() {
            ComponentActivity componentActivity = ComponentActivity.this;
            OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC3329dH(componentActivity, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3538eH(0, componentActivity, onBackPressedDispatcher));
                    return onBackPressedDispatcher;
                }
                componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C5704oM();
        this.menuHostHelper = new C3803fZ0(new RunnableC2555Zd(this, 2));
        Intrinsics.checkNotNullParameter(this, "owner");
        NC1 nc1 = new NC1(this);
        this.savedStateRegistryController = nc1;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = XO0.b(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new k() { // from class: VG
            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a aVar) {
                ComponentActivity._init_$lambda$2(this.d, fp0, aVar);
            }
        });
        getLifecycle().a(new k() { // from class: WG
            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a aVar) {
                ComponentActivity._init_$lambda$3(this.d, fp0, aVar);
            }
        });
        getLifecycle().a(new k() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.k
            public final void b(@NotNull FP0 source, @NotNull androidx.lifecycle.g.a event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().c(this);
            }
        });
        nc1.a();
        s.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new androidx.savedstate.a.b() { // from class: XG
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return ComponentActivity._init_$lambda$4(this.a);
            }
        });
        addOnContextAvailableListener(new W81() { // from class: YG
            @Override // defpackage.W81
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity._init_$lambda$5(this.a, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory = XO0.b(new g());
        this.onBackPressedDispatcher = XO0.b(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity this$0, FP0 fp0, androidx.lifecycle.g.a event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fp0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.g.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity this$0, FP0 fp0, androidx.lifecycle.g.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fp0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.g.a.ON_DESTROY) {
            this$0.contextAwareHelper.b = null;
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            this$0.reportFullyDrawnExecutor.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle outState = new Bundle();
        AbstractC6705t7 abstractC6705t7 = this$0.activityResultRegistry;
        abstractC6705t7.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = abstractC6705t7.b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC6705t7.d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC6705t7.g));
        return outState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity this$0, Context it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = this$0.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            AbstractC6705t7 abstractC6705t7 = this$0.activityResultRegistry;
            abstractC6705t7.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC6705t7.d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC6705t7.g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                LinkedHashMap linkedHashMap = abstractC6705t7.b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = abstractC6705t7.a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        F62.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher dispatcher) {
        getLifecycle().a(new k(this) { // from class: ZG
            public final /* synthetic */ ComponentActivity e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a aVar) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(dispatcher, this.e, fp0, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher dispatcher, ComponentActivity this$0, FP0 fp0, androidx.lifecycle.g.a event) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fp0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.g.a.ON_CREATE) {
            OnBackInvokedDispatcher invoker = a.a.a(this$0);
            dispatcher.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            dispatcher.e = invoker;
            dispatcher.d(dispatcher.g);
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new Vd2();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ComponentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.i0(decorView);
        super.addContentView(view, params);
    }

    @Override // defpackage.InterfaceC3174cZ0
    public void addMenuProvider(@NotNull InterfaceC5324mZ0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        C3803fZ0 c3803fZ0 = this.menuHostHelper;
        c3803fZ0.b.add(provider);
        c3803fZ0.a.run();
    }

    @Override // defpackage.U81
    public final void addOnConfigurationChangedListener(@NotNull InterfaceC3760fL<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull W81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C5704oM c5704oM = this.contextAwareHelper;
        c5704oM.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ComponentActivity componentActivity = c5704oM.b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        c5704oM.a.add(listener);
    }

    @Override // defpackage.InterfaceC3096c91
    public final void addOnMultiWindowModeChangedListener(@NotNull InterfaceC3760fL<K11> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull InterfaceC3760fL<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // defpackage.InterfaceC3725f91
    public final void addOnPictureInPictureModeChangedListener(@NotNull InterfaceC3760fL<C0809Dd1> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // defpackage.InterfaceC5666o91
    public final void addOnTrimMemoryListener(@NotNull InterfaceC3760fL<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // defpackage.InterfaceC7546x7
    @NotNull
    public final AbstractC6705t7 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.e
    @NotNull
    public VP getDefaultViewModelCreationExtras() {
        U11 u11 = new U11(0);
        if (getApplication() != null) {
            w wVar = w.a;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            u11.b(wVar, application);
        }
        u11.b(s.a, this);
        u11.b(s.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            u11.b(s.c, extras);
        }
        return u11;
    }

    @NotNull
    public x.b getDefaultViewModelProviderFactory() {
        return (x.b) this.defaultViewModelProviderFactory.getValue();
    }

    @NotNull
    public C6412rj0 getFullyDrawnReporter() {
        return (C6412rj0) this.fullyDrawnReporter.getValue();
    }

    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    @Override // defpackage.ActivityC2686aH, defpackage.FP0
    @NotNull
    public androidx.lifecycle.g getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.Q81
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getValue();
    }

    @Override // defpackage.OC1
    @NotNull
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.Wd2
    @NotNull
    public Vd2 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        Vd2 vd2 = this._viewModelStore;
        Intrinsics.checkNotNull(vd2);
        return vd2;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        N7.u(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        ED.n(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (this.activityResultRegistry.a(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC3760fL<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(newConfig);
        }
    }

    @Override // defpackage.ActivityC2686aH, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.savedStateRegistryController.b(savedInstanceState);
        C5704oM c5704oM = this.contextAwareHelper;
        c5704oM.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        c5704oM.b = this;
        Iterator it = c5704oM.a.iterator();
        while (it.hasNext()) {
            ((W81) it.next()).a(this);
        }
        super.onCreate(savedInstanceState);
        int i2 = q.e;
        q.a.b(this);
        int i3 = this.contentLayoutId;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        C3803fZ0 c3803fZ0 = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC5324mZ0> it = c3803fZ0.b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            Iterator<InterfaceC5324mZ0> it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (it.next().a(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC3760fL<K11>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new K11(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC3760fL<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator<InterfaceC5324mZ0> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC3760fL<C0809Dd1>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new C0809Dd1(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator<InterfaceC5324mZ0> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        Vd2 vd2 = this._viewModelStore;
        if (vd2 == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            vd2 = cVar.b;
        }
        if (vd2 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = objOnRetainCustomNonConfigurationInstance;
        cVar2.b = vd2;
        return cVar2;
    }

    @Override // defpackage.ActivityC2686aH, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof l) {
            androidx.lifecycle.g lifecycle = getLifecycle();
            Intrinsics.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((l) lifecycle).h(androidx.lifecycle.g.b.g);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC3760fL<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    @NotNull
    public final <I, O> AbstractC6076q7<I> registerForActivityResult(@NotNull AbstractC5023l7<I, O> contract, @NotNull AbstractC6705t7 registry, @NotNull InterfaceC4813k7<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // defpackage.InterfaceC3174cZ0
    public void removeMenuProvider(@NotNull InterfaceC5324mZ0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // defpackage.U81
    public final void removeOnConfigurationChangedListener(@NotNull InterfaceC3760fL<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(@NotNull W81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C5704oM c5704oM = this.contextAwareHelper;
        c5704oM.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c5704oM.a.remove(listener);
    }

    @Override // defpackage.InterfaceC3096c91
    public final void removeOnMultiWindowModeChangedListener(@NotNull InterfaceC3760fL<K11> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(@NotNull InterfaceC3760fL<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // defpackage.InterfaceC3725f91
    public final void removeOnPictureInPictureModeChangedListener(@NotNull InterfaceC3760fL<C0809Dd1> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // defpackage.InterfaceC5666o91
    public final void removeOnTrimMemoryListener(@NotNull InterfaceC3760fL<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (F02.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.i0(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @Nullable Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @NotNull
    public final <I, O> AbstractC6076q7<I> registerForActivityResult(@NotNull AbstractC5023l7<I, O> contract, @NotNull InterfaceC4813k7<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            for (InterfaceC3760fL<K11> interfaceC3760fL : this.onMultiWindowModeChangedListeners) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                interfaceC3760fL.a(new K11(isInMultiWindowMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            for (InterfaceC3760fL<C0809Dd1> interfaceC3760fL : this.onPictureInPictureModeChangedListeners) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                interfaceC3760fL.a(new C0809Dd1(isInPictureInPictureMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.i0(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(@NotNull final InterfaceC5324mZ0 provider, @NotNull FP0 owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        final C3803fZ0 c3803fZ0 = this.menuHostHelper;
        c3803fZ0.b.add(provider);
        c3803fZ0.a.run();
        androidx.lifecycle.g lifecycle = owner.getLifecycle();
        HashMap map = c3803fZ0.c;
        C3803fZ0.a aVar = (C3803fZ0.a) map.remove(provider);
        if (aVar != null) {
            aVar.a.c(aVar.b);
            aVar.b = null;
        }
        map.put(provider, new C3803fZ0.a(lifecycle, new k() { // from class: eZ0
            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a aVar2) {
                g.a aVar3 = g.a.ON_DESTROY;
                C3803fZ0 c3803fZ1 = c3803fZ0;
                if (aVar2 == aVar3) {
                    c3803fZ1.a(provider);
                } else {
                    c3803fZ1.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.i0(decorView);
        super.setContentView(view, params);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull final InterfaceC5324mZ0 provider, @NotNull FP0 owner, @NotNull final androidx.lifecycle.g.b state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        final C3803fZ0 c3803fZ0 = this.menuHostHelper;
        c3803fZ0.getClass();
        androidx.lifecycle.g lifecycle = owner.getLifecycle();
        HashMap map = c3803fZ0.c;
        C3803fZ0.a aVar = (C3803fZ0.a) map.remove(provider);
        if (aVar != null) {
            aVar.a.c(aVar.b);
            aVar.b = null;
        }
        map.put(provider, new C3803fZ0.a(lifecycle, new k() { // from class: dZ0
            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a aVar2) {
                C3803fZ0 c3803fZ1 = c3803fZ0;
                c3803fZ1.getClass();
                g.a.Companion.getClass();
                g.b bVar = state;
                g.a aVarB = g.a.C0236a.b(bVar);
                Runnable runnable = c3803fZ1.a;
                CopyOnWriteArrayList<InterfaceC5324mZ0> copyOnWriteArrayList = c3803fZ1.b;
                InterfaceC5324mZ0 interfaceC5324mZ0 = provider;
                if (aVar2 == aVarB) {
                    copyOnWriteArrayList.add(interfaceC5324mZ0);
                    runnable.run();
                } else if (aVar2 == g.a.ON_DESTROY) {
                    c3803fZ1.a(interfaceC5324mZ0);
                } else if (aVar2 == g.a.C0236a.a(bVar)) {
                    copyOnWriteArrayList.remove(interfaceC5324mZ0);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i2) {
        this();
        this.contentLayoutId = i2;
    }
}
