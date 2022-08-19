(ns cljs-thread.re-frame.state
  (:require
   [reagent.core :as r]))

(defonce ^:export subscriptions
  (r/atom {}))
