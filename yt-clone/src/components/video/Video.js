import React from "react"
import "./_video.scss"

import {AiFillEye} from 'react-icons/ai'

const Video = () => {
    return (
        <div className='video'>
            <div className='video__top'>
                <img src='https://i.ytimg.com/vi/osBkM9DSTxE/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC_JC5J8XBuArmA_vPoG_pLq7KvXw' alt='' />
                <span>05:43</span>
            </div>
            <div className='video__title'>
                Create app in 5 minutes #made by Chintu
            </div>
            <div className='video__details'>
                <span>
                    <AiFillEye /> 5m Views •
                </span>
                <span>5 days ago</span>
            </div>
            <div className='video__channel'>
                <img src='https://yt3.ggpht.com/ytc/AMLnZu8TTeIvbMYzqqAIoPF7amamnUa9wgl9npK8qzKh=s88-c-k-c0x00ffffff-no-rj' alt='' />
                <p>Rainbow Hat Jr</p>
            </div>
        </div>
    );
}

export default Video